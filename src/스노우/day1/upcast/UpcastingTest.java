package 스노우.day1.upcast;


import java.util.ArrayList;
import java.util.List;

public class UpcastingTest {
    public static void main(String[] args) {
        solution1(); // 자식 객체 업캐스팅 후 다른 자식 객체로 다운캐스팅 * 오류 발생
        solution2(); // 상속 사용이유 예시
        solution3(); // 부모 객체 생성 후 다운 캐스팅  * 오류 발생
    }

    public static void solution1(){
        a a = new b(20);
        System.out.println(a.name);
        c c = (c) a;
        System.out.println(c.nickName);
    }

    public static void solution2(){
        ai a = new bi();
        ai c = new ci();
        List<ai> list = new ArrayList<>(List.of(
                a, c
        ));
        for(ai obj : list) {
            obj.sayAge();
        }

    }

    public static void solution3(){
        A a = new A("name");
        System.out.println(a.name);
//        C c = (C) a;
        B b = (B) a;
//        System.out.println(c.nickName);
        System.out.println(b.age);
    }
}
