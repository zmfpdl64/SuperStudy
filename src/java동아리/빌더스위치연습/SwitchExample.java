package java동아리.빌더스위치연습;

public class SwitchExample {
    public static void main(String[] args) {
        solution1();
        solution2();
    }

    public static void solution1() {
        for(Product product : Product.values()){
            switch(product){
                case STUDENT:
                    System.out.println("학생입니다.");
                    break;
                case TEACHER:
                    System.out.println("선생입니다");
                    break;
                case GUEST:
                    System.out.println("손님입니다.");
                    break;
                default:
                    System.out.println("누구세요?");
            }
        }
    }

    public static void solution2() {
        String[] peoples = {
                "Student",
                "Teacher",
                "Guest"
        };
        for(String product : peoples){
            switch(product){
                case "Student":
                    System.out.println("학생입니다.");
                    break;
                case "Teacher":
                    System.out.println("선생입니다");
                    break;
                case "Guest":
                    System.out.println("손님입니다.");
                    break;
                default:
                    System.out.println("누구세요?");
            }
        }
    }
}
enum Product{
    STUDENT,
    TEACHER,
    GUEST
}

