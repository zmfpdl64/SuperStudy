package 네이버클라우드.과제.entity;

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
        this.revenue = revenue;
    }

    public void explainItemInfo(String itemInfo, long itemPrice) {
        System.out.println("점원: 이 제품은 " + itemInfo + "이 장점 이고 가격은 "+ itemPrice + "입니다");
    }

    public void sayNoStock() {
        System.out.println("재고가 없습니다...");
    }

    public void sayMessage(String message) {
        System.out.println(message);
    }
    public void sayProgressSellItem(Item item){
        System.out.println("직원: 고객님 주문 도와드리겠습니다. "+item.getPrice() + " 입니다.");
    }

    public void provideDeliveryInfoToUser(String arriveTime, String itemName, long deliveryPrice){
        System.out.println("점원: 손님 " +
                itemName + "은 배송 도착날짜는 "+
                arriveTime + "이고 제품가격 + 배송료는 " +
                deliveryPrice + "입니다." ) ;
    }
}
