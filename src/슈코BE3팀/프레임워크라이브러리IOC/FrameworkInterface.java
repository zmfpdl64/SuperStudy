package 슈코BE3팀.프레임워크라이브러리IOC;


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
 */

// 프레임 워크의 특징
// 행동을 강제함
public interface FrameworkInterface {
    //2. 의존성 주입
    default void 시작(){
        System.out.println("프레임워크 시작!!");
        System.out.println("세팅을 시작합니다!!");
    };
    void 서비스로직();
    default void 끝(){
        System.out.println("자원을 반납합니다.");
        System.out.println("프로그램 종료!!");
    };
    default void run () {
        시작();
        서비스로직();
        끝();
    }
}

class FrameWork implements FrameworkInterface{
    private final 객체 객체1;
    private final 객체2 객체2;

    public FrameWork(객체 객체1, 객체2 객체2) {
        this.객체1 = 객체1;
        this.객체2 = 객체2;
    }
    @Override
    public void 서비스로직() {
        System.out.println("내가 조종할 수 있는 부분 -> 비즈니스 로직 작성"); //작성가능
    }

    @Override
    public void run() {
        시작();
        서비스로직();
        끝();
    }
}
/**
 * 생성되는 객체
 */
class 객체 {
    public 객체() {
    }
}
class 객체2 {
    public 객체2() {
    }
}