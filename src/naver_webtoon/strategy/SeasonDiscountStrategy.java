package naver_webtoon.strategy;

public class SeasonDiscountStrategy implements  DiscountStrategy{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.35;
    }
}
