package snow.day5.lambda;

public class Main {
    public static void main(String[] args) {
        MultipleINum multipleINum = (a) -> a + 10;
        MultipleINum multipleINum1 = (a) -> a * 2;
        int calculate = multipleINum.calculate(5);
        int calculate2 = multipleINum.calculate(10);
        System.out.println(calculate);
        System.out.println(calculate2);

        StringNum stringNum = (str1, num) -> {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < num; i++) {
                sb.append(str1);
            }
            System.out.println(sb);
        };
        stringNum.printString("hello", 3);
    }
}
