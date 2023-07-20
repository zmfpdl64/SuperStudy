package snow.day4.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인메소드가 시작합니다.");
//        makeUnchekcException();
        makeCheckedException();
        System.out.println("메인메소드가 종료합니다.");
    }
    public static void makeUnchekcException() {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int idx = 10;
        System.out.println(intArr[idx]);
    }
    public static void makeCheckedException() throws FileNotFoundException {
        File file = new File("src/snow/day4/exception/text.txt");
        try {
            FileInputStream fs = new FileInputStream(file);
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("FS 실행됩니다.");
    }
}
