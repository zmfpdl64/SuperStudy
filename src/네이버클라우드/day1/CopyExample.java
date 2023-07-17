package 네이버클라우드.day1;

public class CopyExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7,8};

        int num1 = 10;
        int num2 = 10;

        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "Hell0";

        int hashCode = System.identityHashCode(arr);
        int hashCode2 = System.identityHashCode(arr2);

        int numHashCode = System.identityHashCode(num1);
        int numHashCode2 = System.identityHashCode(num2);

        int stringHashCode = System.identityHashCode(string1);
        int stringHashCode2 = System.identityHashCode(string2);
        int stringHashCode3 = System.identityHashCode(string3);

        System.out.println("객체 메모리 주소: " + hashCode + " : " +  hashCode2);
        System.out.println("리터럴 정수 주소: " + numHashCode + " : " +  numHashCode2);
        System.out.println("리터럴 문자열 주소: " + stringHashCode + " : " + stringHashCode2);
        System.out.println("리터럴 문자열 주소, 변형: " + stringHashCode + " : " + stringHashCode3);

        // ----------------------------------------------------------
    }
}
