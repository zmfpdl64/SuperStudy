package 스노우.day1;

public class UpcastingTest {
    public static void main(String[] args) {
        a a = new b(20);
        System.out.println(a.name);
        b b = (b) a;
        System.out.println(b.age);
    }
}
