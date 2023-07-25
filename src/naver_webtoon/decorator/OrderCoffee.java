package naver_webtoon.decorator;

public class OrderCoffee {
    public static void main(String[] args) {
        //현재 Milk 추가 기능
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + ": $" + coffee.cost());

        Beverage milkWithCoffee = new Milk(coffee);
        System.out.println(milkWithCoffee.getDescription() + ": $" + milkWithCoffee.cost());

        Beverage sugarWithCoffee = new Sugar(coffee);
        System.out.println(sugarWithCoffee.getDescription() + " $" + sugarWithCoffee.cost());

        Beverage cream = new Cream(new Milk(new Coffee()));
        System.out.println(cream.getDescription() + " $" + cream.cost());
    }
}
