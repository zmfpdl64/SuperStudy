package 네이버클라우드.과제.entity;

import 네이버클라우드.과제.exception.StoreErrorCode;
import 네이버클라우드.과제.exception.StoreException;

public class Guest {

    private String name;
    private long money;
    private boolean preferBuy;
    private Feeling feeling;
    private Item item;

    /**
     * 
     * @param name 이름
     * @param money 돈
     * @param preferBuy 구매 선호도
     * @param feeling 기분
     */
    public Guest(String name, long money, boolean preferBuy, Feeling feeling, Item item) {
        this.name = name;
        this.money = money;
        this.preferBuy = preferBuy;
        this.feeling = feeling;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        if(money < 0){
            throw new StoreException(StoreErrorCode.OUT_OF_BOUND_MONEY);
        }
        this.money = money;
    }

    public boolean isPreferBuy() {
        return preferBuy;
    }

    public void setPreferBuy(boolean preferBuy) {
        this.preferBuy = preferBuy;
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public void setFeeling(Feeling feeling) {
        this.feeling = feeling;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean canBuyItem(long itemPrice) {
        if(itemPrice <= getMoney()){
            return true;
        }
        throw new StoreException(StoreErrorCode.CUSTOMER_NO_HAVE_MONEY);
    }

    public void sayLaterCome(){
        System.out.println("손님: 다음에 올게요... 현재 남은 금액은: " + this.getMoney() + " 남았습니다.");
    }

    public void buyItem(StoreClerk storeClerk) throws RuntimeException {
        Item buyItem = this.getItem();
        if(canBuyItem(buyItem.getPrice())){
            storeClerk.setRevenue(storeClerk.getRevenue() + buyItem.getPrice());
            this.setMoney(this.getMoney()-this.getItem().getPrice());
        }
    }

    public void refundBuyItem(StoreClerk storeClerk){
        Item refundItem = this.getItem();
        this.setMoney(this.getMoney()+refundItem.getPrice());
        storeClerk.setRevenue(storeClerk.getRevenue()-refundItem.getPrice());
        sayRefundMessage();
    }

    public void payDeliveryPrice(DeliveryDriver driver, long totalPrice) throws RuntimeException {
        if(canBuyItem(totalPrice)){
            driver.setRevenue(driver.getRevenue() + totalPrice);
            this.setMoney(this.getMoney()-totalPrice);
        }
    }

    public void sayRefundMessage(){
        System.out.println("손님: 배송료가 너무 비싸네요.. 신발 가격 환불해주세요");
    }

    public void askItemInfo() {
        System.out.println("손님: " + this.getItem().getItemName() +" 제품에 대해서 알려주세요");
    }

    public void sayFeeling(Feeling feeling) {
        this.setFeeling(feeling);
        System.out.println("손님: 이 제품이 " + this.getItem().getAdvantage() +
                            "이 좋아서 " + "기분이 " + feeling.name() + "다" + "\n" +
                            "남은 잔액은 " + this.getMoney() + " 남았습니다."
                );

    }

    public void sayMessage(String message) {
        System.out.println(message);
    }
    public void sayProgressBuy(){
        System.out.println("손님: 네 좋네요, 주문 계속 진행할게요.");
    }
}
