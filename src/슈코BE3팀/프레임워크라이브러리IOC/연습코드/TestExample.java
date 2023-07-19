package 슈코BE3팀.프레임워크라이브러리IOC.연습코드;

public class TestExample {
    private static 의존성주입클래스 의존성주입클래스 = new 의존성주입클래스();

    public static void main(String[] args) {

        A_Interface A_프레임워크 = new A_프레임워크();
        A_프레임워크.규칙(의존성주입클래스.멤버서비스객체주입(), 의존성주입클래스.게시글서비스객체주입());
    }

//    public static void main(String[] args) {
//        chapter2.BuilderClass builder = new chapter2.BuilderClass();
//        chapter2.BuilderClass setArgs = builder.name("name")
//                .age(25)
//                .message("this is message");
//
//        System.out.println(setArgs.toString());
//    }
}
