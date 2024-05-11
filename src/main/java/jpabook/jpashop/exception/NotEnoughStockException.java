package jpabook.jpashop.exception;

public class NotEnoughStockException extends RuntimeException {

    // 전부 다 오버라이드 한 메서드

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
