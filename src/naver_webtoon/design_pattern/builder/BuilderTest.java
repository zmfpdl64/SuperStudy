package naver_webtoon.design_pattern.builder;

import snow.day1.upcast.C;

public class BuilderTest {
    public static void main(String[] args) {
        //적용전
        Customer customer = new Customer("이순신", 10, "남자");

        //적용 후
        Customer customer2 = new Customer.CustomerBuilder()
                .setName("아이유")
                .setAge(10)
                .setGender("여자")
                .build();

        System.out.println(customer);
        System.out.println(customer2);

    }
}
