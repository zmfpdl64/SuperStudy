package 네이버클라우드.day1;

public class AgeGrade {
    public static void main(String[] args) {
        int age = 10;
        if(0 > age) {
            System.out.println("유아 관람불가");
        }else if(age < 12) {
            System.out.println("전체 관람가");
        }else if(age < 15) {
            System.out.println("12세 이상 관람가");
        }else if(age < 19) {
            System.out.println("15세 이상 관람가");
        }else {
            System.out.println("청소년 관람불가");
        }
    }
}
