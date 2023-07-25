package naver_webtoon.method_reference;

import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("카리나"),
                new Customer("유재석"),
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("카리나"),
                new Customer("유재석")
        );
        Customer newCustomer = new Customer("이순신");
        long count = customerList.stream()
                .map(Customer::getName)
                .filter(newCustomer.getName()::equals)
                .count();
        System.out.println("해당 객체와 동일한 객체 수는: " + count);

        //
    }
}
