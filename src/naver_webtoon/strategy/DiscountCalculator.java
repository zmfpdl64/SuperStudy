package naver_webtoon.strategy;

public class DiscountCalculator implements DiscountStrategy{
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double calculateDiscount(double amount) {
        if( strategy == null) {
            return amount * 0.2;
        }
        return strategy.calculateDiscount(amount);
    }
}
