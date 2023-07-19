package snow.day2.팀장님지시업무;

public class JvmTest {
    static final long MY_LONG = 5L;

    public static void main(String[] args){
        // 1. JvmTest JVM 로드 진행 이후

        int myInt = 10;
        String name = "이순신";
        long myLong = MY_LONG;
        Customer customer = new Customer("장영실");
        int[] intArr = new int[3];

        // 2. 여러 로컬 변수 선언 후
        makeCustomer(name);
        customer = null;

        // 4. makeCustomer 메소드 종료 및 null 선언 후

        String str1 = "Hello World";
        String str2 = new String("Hello World");

        // 5. 각 String 변수 선언 후
    }

    static void makeCustomer(String name){
        String nameWithUppercase = name.toUpperCase();
        Customer customer = new Customer(nameWithUppercase);
        // 3. makeCustomer 메소드 내부 진행
    }
}
