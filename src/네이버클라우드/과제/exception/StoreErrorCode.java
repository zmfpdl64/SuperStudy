package 네이버클라우드.과제.exception;

import java.util.Arrays;

public enum StoreErrorCode {
    ITEM_NO_HAVE_QUANTITY("어?? 재고가 없습니다 배송으로 주문하시겠어요?"),
    CUSTOMER_NO_HAVE_MONEY("어?? 돈이 없네 돈 가져올게요!!"),
    OUT_OF_BOUND_MONEY("예상치 못한 값이 넘어 왔습니다..");
    private final String description;

    public String getMessage() {
        return description;
    }

    StoreErrorCode(String description) {
        this.description = description;
    }
}
