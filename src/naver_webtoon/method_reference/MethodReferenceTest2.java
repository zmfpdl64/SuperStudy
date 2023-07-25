package naver_webtoon.method_reference;

import snow.day1.upcast.C;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {
    public static void main(String[] args) {
        //Instance 참조
        Customer customer1 = new Customer("아이유");
        Customer customer2 = new Customer("이순신");

        Supplier<String> ex1 = customer1::toString;
        Supplier<String> ex2 = customer2::toString;

        System.out.println(ex1.get());
        System.out.println(ex2.get());

        // 임의 객체 메소드 호출
        List<Customer> customerList = List.of(
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("카리나"),
                new Customer("유재석")
        );
        customerList.forEach(System.out::println);

    }
}
