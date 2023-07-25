package naver_webtoon.method_reference;

import snow.day4.팀장님지시사항.Customer;

import javax.print.attribute.standard.PrinterState;
import java.io.PrintWriter;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static void main(String[] args) {
        // Static method
        Consumer<String> ex2 = (str) -> Printer.printSomething(str);
        Consumer<String> ex1 = Printer::printSomething;
        ex1.accept("lambda 식 사용");
        ex2.accept(("MethodReference 사용"));

        // 생성자 호출
        Supplier<Customer> ex3 = () -> new Customer();
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());
        System.out.println(ex4.get());

        // String을 입력값 받고 Customer을 반환한다는 클래스
        Function<String, Customer> ex5 = (String str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println(ex5.apply("아이유"));
        System.out.println(ex6.apply("이순신"));


    }
}
