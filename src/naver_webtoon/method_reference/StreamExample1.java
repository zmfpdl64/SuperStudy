package naver_webtoon.method_reference;

import snow.day4.팀장님지시사항.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Customer> customerList = List.of(
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("혜원"),
                new Customer("유재석")
        );
        customerList.stream()
                .map(customer -> customer.getName())
                .filter(StringUtils::isLongName)
                .sorted()
                .forEach(System.out::println);


        List<String> customerNames = List.of(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );
        List<Customer> customerList2 = customerNames.stream()
                .map(name -> new Customer(name))
                .collect(Collectors.toList());

        System.out.println("customerList: " + customerList2);
    }
}
