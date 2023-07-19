package snow.day1.upcast;

public class ConstantPool {
    public static void main(String[] args) {
        String str1 = "Hello";
        double d = 5.5d;
        float f = 10.5f;
        int i = 32_768;
        final int finalInt = 11;

        int a = 10;
        int b = 10;

        String str2 = "Hello";
//        System.out.println(
//                "문자열 상수: " + System.identityHashCode(str1) +"\n" +
//                "더블형 상수: " + System.identityHashCode(d) + "\n" +
//                "플롯트 상수: " + System.identityHashCode(f) + "\n" +
//                "정수 상수: " + System.identityHashCode(i) + "\n" +
//                "final 정수 상수: " + System.identityHashCode(finalInt) + "\n"
//        );
        System.out.println(System.identityHashCode(a) + " : " + System.identityHashCode(b));
        while(true){
            try {
                Thread.sleep(100);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
