package naver_webtoon.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double discount = calculator.calculateDiscount(10_000);
        // 신규 가입자 할인
        calculator.setStrategy(new NewCustomerDiscountStrategy());
        double discount1 = calculator.calculateDiscount(10_000);

        //
        calculator.setStrategy(new SeasonDiscountStrategy());
        double discount2 = calculator.calculateDiscount(10_000);

        //
        calculator.setStrategy(new ReferenceFriendDiscountStrategy());
        double discount3 = calculator.calculateDiscount(10_000);

        //
        System.out.println("discount: " + discount);
        System.out.println("newCustomer discount: " + discount1);
        System.out.println("season discount: " + discount2);
        System.out.println("friend discount: " + discount3);

    }
}
