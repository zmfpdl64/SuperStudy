package 슈코BE3팀.프레임워크라이브러리IOC;

public class GenericExample {

}
interface A_Interface {
    String postFix = ".txt";
    default <T, G> void 규칙(T tClass, G gClass) {
        // 서비스 로직 실행
        if(tClass instanceof MemberService){
            MemberService tClass1 = (MemberService) tClass;
            // 결과 반환
            tClass1.getName();
        }
        if(gClass instanceof PostService){
            PostService gClass1 = (PostService) gClass;
            gClass1.getName();
        }
    }
    default String getFile(String fileName){
        return fileName + postFix;
    };
}

class A_프레임워크 implements A_Interface {
}

class MemberService{
    public MemberService() {
    }
    public void getName() {
        System.out.println("멤버 서비스 객체입니다");
    }
}
class PostService{
    public PostService() {
    }

    public void getName() {
        System.out.println("게시글 서비스 객체입니다.");
    }
}
