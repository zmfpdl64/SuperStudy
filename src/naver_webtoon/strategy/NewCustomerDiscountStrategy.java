package naver_webtoon.strategy;

public class NewCustomerDiscountStrategy implements DiscountStrategy{

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.3;
    }
}
