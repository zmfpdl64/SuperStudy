package naver_webtoon.decorator;

public class Coffee implements Beverage {

    @Override
    public String getDescription() {
        return "Coffe";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
