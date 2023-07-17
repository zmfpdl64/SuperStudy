package 슈코BE3팀.프레임워크라이브러리IOC;

public class 프레임워크_라이브러리_IOC역전 {



    /**
     * 1. 프레임워크의 생성 기원
     *  1.1. 자주 사용되는 기능
     *  1.2. 매번 설정해줘야 하는 설정들
     *  1.3. 협업하기 위한 규칙

     장점:
     1. 객체의 생명주기 관리
     2. 의존성 주입
     3. 컴포넌트 재사용성
     4. 성능 최적화
     5. 테스트 용이성

     * 2. 라이브러리
     * 3. IOC란??
     */


    // IOC 역전
    class DI_클래스{
        public final MemberService memberService = new MemberService();
        public final PostService postService = new PostService();

        public DI_클래스() {
        }
    }

    DI_클래스 di = new DI_클래스();

    class 개발자가_관리하는_프로그램 {
        private final MemberService memberService;
        private final PostService postService;

        public 개발자가_관리하는_프로그램(MemberService memberService, PostService postService) {
            this.memberService = memberService;
            this.postService = postService;
        }

        public void runMehthod() {
            memberService.getName();
            postService.getName();
        }
    }
    개발자가_관리하는_프로그램 custom = new 개발자가_관리하는_프로그램(di.memberService, di.postService);


    // 프레임워크가 강제하는 동작 방식
    // 협업을 위한 도구 !!
    public interface 반복되는설정들 {
        String postFix = ".txt";
        default String getFile(String fileName){
            return fileName + postFix;
        };
    }
    public interface 자주사용되는기능 {
        //프로그램을 개발할 때 자주 사용되던 기능들
        // URL 맵핑
        //
        default void PlayProgram() {
            System.out.println("프로그램이 시작됩니다.");
        }
        default void CloseProgram(){
            System.out.println("프로그램이 종료됩니다.");
        };
    }

//     @RequiredArgsConstructor
//     @Controller
    class 프레임워크가_관리하는_프로그램 implements 반복되는설정들, 자주사용되는기능 {
//        private final 슈코BE3팀.프레임워크라이브러리IOC.MemberService memberService;
//        private final 슈코BE3팀.프레임워크라이브러리IOC.PostService postService;

    @Override
    public String getFile(String fileName) {
        int start_idx = fileName.length()-4;
        int end_idx = fileName.length();
        try{
            if(fileName.substring(start_idx, end_idx).equals(".txt")){
                return fileName;
            }
            return 반복되는설정들.super.getFile(fileName);
        }catch(Exception e) {
            return fileName;
        }
    }
}

    /**
     * 생성되는 객체
     */
    class MemberService {
        public MemberService() {
        }
        public void getName() {
            System.out.println("멤버 서비스 객체입니다");
        }
    }
    class PostService {
        public PostService() {
        }

        public void getName() {
            System.out.println("게시글 서비스 객체입니다.");
        }
    }
}


