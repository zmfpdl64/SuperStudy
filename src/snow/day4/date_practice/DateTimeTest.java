package snow.day4.date_practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Stack;
import java.util.WeakHashMap;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime date = LocalDateTime.of(2023, 12, 10, 10, 30); // 시간
        DateTimeFormatter koreaFormat = DateTimeFormatter.ofPattern("YY-MM-dd");
        DateTimeFormatter americaFormat  = DateTimeFormatter.ofPattern("dd-MM-YY");

        Stack<Integer> stack  = new Stack<>();
        WeakHashMap<String, Integer> map = new WeakHashMap<>();


        System.out.println(date.format(koreaFormat));
        System.out.println(date.format(americaFormat));

    }
}
