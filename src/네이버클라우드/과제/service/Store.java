package 네이버클라우드.과제.service;

import 네이버클라우드.과제.dao.ItemRepository;
import 네이버클라우드.과제.entity.*;
import 네이버클라우드.과제.exception.StoreErrorCode;
import 네이버클라우드.과제.exception.StoreException;


/**
 * 고려 사항
 * 점원과 배달기사를 필드로 사용할지 안할지
 * 들여쓰기 3줄 이하
 * 긍정문으로 메소드 이름짓기
 * 메소드당 10줄 이내로 작성
 * 필드 외부에서 주입하기
 * 원시타입 지향
 */

/**
 * StoreInterface를 상속 다형성 지킴
 */
public class Store implements StoreInterface {
    private StoreClerk storeClerk;
    private DeliveryDriver deliveryDriver;
    private ItemRepository itemRepository;

    public Store(StoreClerk storeClerk, DeliveryDriver deliveryDriver, ItemRepository itemRepository) {
        this.storeClerk = storeClerk;
        this.deliveryDriver = deliveryDriver;
        this.itemRepository = itemRepository;
    }

    @Override
    public boolean guestAskItem(Guest guest) {
            guest.askItemInfo();
            Item item = itemRepository.findItem(guest.getItem().getItemName())
                    .orElseThrow(() ->
                        new StoreException(StoreErrorCode.ITEM_NO_HAVE_QUANTITY)
                    ); //빈값을 그냥 던지는 방법!! empty list, empty map
            storeClerk.explainItemInfo(item.getAdvantage(), item.getPrice());

            return true;
    }
    @Override
    public boolean guestCanBuyItem(Guest guest) {
        return guest.canBuyItem(guest.getItem().getPrice());
    }

    @Override
    public boolean isGuestPreferBuy(Guest guest) {
        return guest.isPreferBuy();
    }

    @Override
    public void buyItem(Guest guest){
        guest.buyItem(storeClerk);
    }

    public void payDeliveryPrice(Guest guest, long price) {
        guest.payDeliveryPrice(deliveryDriver, price);
    }

    public boolean checkItemQuantity(Item item) {
        return item.getStockQuantity() > 0;
    }

    //메인 메소드
    public void goToStore(Guest guest) { //메소드가 너무 길어
        try{
            guestAskItem(guest); //아이템 물어보고 점원이 소개
            guestCanBuyItem(guest); // 아이템 살 수 있는지 확인
            if(checkItemQuantity(guest.getItem())){ // 아이템 수량 체크
                buyItemProcess(guest); // 구매 진행
                return;
            }
            if(isGuestPreferBuy(guest)){    // 손님이 제품 구매를 선호하는지 확인
                guestBuyPreferItem(guest); // 손님 선호할 때 구매
                return;
            }
            guest.sayLaterCome();
        }catch(StoreException e) {
            sayGuestErrorMessage(guest, e);
        }catch(Exception e) {
            storeClerk.sayMessage(e.getMessage());
        }
    } // 크리티컬 할 때만 throw를 사용한다!!!

    private void buyItemProcess(Guest guest) {
        guest.sayProgressBuy();
        storeClerk.sayProgressSellItem(guest.getItem());
        buyItem(guest);
        guest.sayFeeling(Feeling.HAPPY);
    }

    private void sayGuestErrorMessage(Guest guest, StoreException e) {
        switch(e.getCode()) {
            case ITEM_NO_HAVE_QUANTITY:
                storeClerk.sayMessage(e.getMessage());
                break;
            case CUSTOMER_NO_HAVE_MONEY:
            case OUT_OF_BOUND_MONEY:
                guest.sayMessage(e.getMessage());
                break;
            default:
                break;
        }
    }

    private void guestBuyPreferItem(Guest guest) {
            buyItem(guest); // buyItem으로 값이 변함
            guest.sayProgressBuy();
            String arriveTime = deliveryDriver.arriveDeliveryTime(guest);
            long total_price = deliveryDriver.getDeliveryPrice() + guest.getItem().getPrice();
            storeClerk.provideDeliveryInfoToUser(arriveTime, guest.getItem().getItemName(), total_price);
            try {
                payDeliveryPrice(guest, deliveryDriver.getDeliveryPrice()); // payDeliveryPrice로 값이 변함
                guest.sayFeeling(Feeling.HAPPY);
            }catch(Exception e) {
                guest.refundBuyItem(storeClerk);
                guest.sayLaterCome();
            }
    }
}
