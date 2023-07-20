package snow.day4.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyTest {
    public static void main(String[] args) {
        System.out.println("메소드가 실행됩니다.");

        try(FileInputStream fs = new FileInputStream("src/snow/day4/exception/text.txt")) {
            Integer myInt = 10;
            Integer data = 100 / myInt;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("MyInt는 0이 될 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("메소드가 종료됩니다.");
    }
}
