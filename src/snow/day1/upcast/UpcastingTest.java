package snow.day1.upcast;


import java.util.ArrayList;
import java.util.List;

public class UpcastingTest {

    String hello = "hello";
    String hello2 = "hello2";
    String hello3 = new String("hello3");
    public static void main(String[] args) {
        solution1(); // 자식 객체 업캐스팅 후 다른 자식 객체로 다운캐스팅 * 오류 발생
//        solution2(); // 상속 사용이유 예시
//        solution3(); // 부모 객체 생성 후 다운 캐스팅  * 오류 발생
    }

    public static void solution1(){
        A[] as = new A[1000];

        for(int i = 0; i < 1_000; i++) {
            A a = new B(20);
            as[i] = a;
            System.out.println(a.name);
        }

        System.gc();

        for(A a: as){
            System.out.println(a.name);
        }

        while(true) {
            try {
                Thread.sleep(100);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
//        c c = (c) a;
//        System.out.println(c.nickName);
    }

    public static void solution2(){
        AI a = new BI();
        AI c = new CI();
        List<AI> list = new ArrayList<>(List.of(
                a, c
        ));
        for(AI obj : list) {
            obj.sayAge();
        }
    }

    public static void solution3(){
//        A a = new A("name");
//        System.out.println(a.name);
//        C c = (C) a;
//        B b = (B) a;
//        System.out.println(c.nickName);
//        System.out.println(b.age);
    }
}

