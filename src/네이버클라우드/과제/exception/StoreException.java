package 네이버클라우드.과제.exception;

public class StoreException extends RuntimeException{
    private StoreErrorCode code;

    public StoreException(StoreErrorCode code){
        this.code = code;
    }

    public StoreErrorCode getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return code.getMessage();
    }
}
