package 네이버클라우드.과제.exception;

public enum StoreErrorCode {
    ITEM_NO_HAVE_QUANTITY("점원: 어?? 재고가 없습니다 배송으로 주문하시겠어요?"),
    CUSTOMER_NO_HAVE_MONEY("손님: 어?? 돈이 없네 돈 가져올게요!!");
    private final String description;

    public String getMessage() {
        return description;
    }

    StoreErrorCode(String description) {
        this.description = description;
    }
}
