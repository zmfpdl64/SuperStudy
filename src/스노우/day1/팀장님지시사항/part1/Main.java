package 스노우.day1.팀장님지시사항.part1;

public class Main {
    public static void main(String[] args) {
        // Circle 객체 생성
        Circle circle = new Circle(5.0);
        System.out.println("기본 원 색상: " + circle.getColor());
        System.out.println("기본 원 차원: " + circle.getDimension());
        circle.setColor("빨강");  // 도형의 색상 설정

        // Circle 객체 정보 출력
        System.out.println("원 반지름: " + circle.getRadius());
        System.out.println("원 지름: " + circle.calculateDiameter());
        System.out.println("원 둘레: " + circle.calculatePerimeter());
        System.out.println("원 면적: " + circle.calculateArea());
        System.out.println("원 색상: " + circle.getColor());

        System.out.println("---------------------------------------------");

        // Rectangle 객체 생성
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("기본 직사각형 색상: " + rectangle.getColor());
        System.out.println("기본 직사각형 차원: " + rectangle.getDimension());

        rectangle.setColor("파랑");  // 도형의 색상 설정


        // Rectangle 객체 정보 출력
        System.out.println("직사각형 가로 길이: " + rectangle.getWidth());
        System.out.println("직사각형 세로 길이: " + rectangle.getHeight());
        System.out.println("직사각형 대각선 길이: " + rectangle.calculateDiagonal());
        System.out.println("직사각형 면적: " + rectangle.calculateArea());
        System.out.println("직사각형 둘레길이: " + rectangle.calculatePerimeter());
        System.out.println("직사각형 색상: " + rectangle.getColor());
    }
}
