package naver_webtoon.strategy;

public class ReferenceFriendDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.4;
    }
}
