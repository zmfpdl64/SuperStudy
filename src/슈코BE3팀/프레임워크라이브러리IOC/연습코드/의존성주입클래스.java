package 슈코BE3팀.프레임워크라이브러리IOC.연습코드;

public class 의존성주입클래스 {
        public final static MemberService memberService = new MemberService();
        public final static PostService postService = new PostService();

        public 의존성주입클래스() {

        }

    public MemberService 멤버서비스객체주입() {
        return memberService;
    }

    public PostService 게시글서비스객체주입() {
        return postService;
    }
}
