package snow.day4.exception;

public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println("메소드를 실행합니다.");

        try {
            int i = 0;
            int data = 50 / i;
            System.out.println("data " + data);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("메소드가 종료됩니다.");
    }
}
