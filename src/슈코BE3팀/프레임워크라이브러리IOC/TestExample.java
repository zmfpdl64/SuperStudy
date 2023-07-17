package 슈코BE3팀.프레임워크라이브러리IOC;

public class TestExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        PostService postService = new PostService();
        A_Interface A_프레임워크 = new A_프레임워크();
        A_프레임워크.규칙(memberService, postService);
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
