package 네이버클라우드.과제.entity;

import 네이버클라우드.과제.exception.StoreErrorCode;
import 네이버클라우드.과제.exception.StoreException;

public class StoreClerk {

    private String clerkName;

    private long revenue;

    public StoreClerk(String clerkName, long revenue) {
        this.clerkName = clerkName;
        this.revenue = revenue;
    }

    public String getClerkName() {
        return clerkName;
    }

    public void setClerkName(String clerkName) {
        this.clerkName = clerkName;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        if(revenue < 0){
            throw new StoreException(StoreErrorCode.OUT_OF_BOUND_MONEY);
        }
        this.revenue = revenue;
    }

    public void explainItemInfo(String itemInfo, long itemPrice) {
        String message = "이 제품은 " + itemInfo + "이 장점 이고 가격은 "+ itemPrice + "입니다";
        sayMessage(message);
    }
    public void sayProgressSellItem(Item item){
        String message = "고객님 주문 도와드리겠습니다. "+item.getPrice() + " 입니다.";
        sayMessage(message);
    }

    public void provideDeliveryInfoToUser(String arriveTime, String itemName, long deliveryPrice){
        String message = "손님 " +
                itemName + "은 배송 도착날짜는 "+
                arriveTime + "이고 제품가격 + 배송료는 " +
                deliveryPrice + "입니다." ;
        sayMessage(message);
    }
    public void sayMessage(String message) {
        System.out.println("점원: " +message);
    }
}
