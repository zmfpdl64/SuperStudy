package 슈코BE3팀.프레임워크라이브러리IOC.연습코드;

public class 프레임워크_라이브러리_IOC역전 {


    /**
     * 3. IOC(Inversion Of Controller) 란??
     */

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


    // 프레임워크가 강제하는 동작 방식
    // 협업을 위한 도구 !!
    public interface 반복되는설정들 {
        String postFix = ".txt";

        default String getFile(String fileName) {
            return fileName + postFix;
        }

        ;
    }

    public interface 자주사용되는기능 {
        //프로그램을 개발할 때 자주 사용되던 기능들
        // URL 맵핑
        default void PlayProgram() {
            System.out.println("프로그램이 시작됩니다.");
        }

        default void CloseProgram() {
            System.out.println("프로그램이 종료됩니다.");
        }

        ;
    }

    //     @RequiredArgsConstructor
//     @Controller
    class 프레임워크가_관리하는_프로그램 implements 반복되는설정들, 자주사용되는기능 {
//        private final 슈코BE3팀.프레임워크라이브러리IOC.연습코드.MemberService memberService;
//        private final 슈코BE3팀.프레임워크라이브러리IOC.연습코드.PostService postService;

        @Override
        public String getFile(String fileName) {
            int start_idx = fileName.length() - 4;
            int end_idx = fileName.length();
            try {
                if (fileName.substring(start_idx, end_idx).equals(".txt")) {
                    return fileName;
                }
                return 반복되는설정들.super.getFile(fileName);
            } catch (Exception e) {
                return fileName;
            }
        }
    }
}


