package snow.day4.enum_practice;

public class DayTest {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        System.out.println("요일: " + monday);
        System.out.println("요일: " + monday.getDescription());

        switch(monday) {
            case SUNDAY:
                System.out.println("일");
                break;
            case MONDAY:
                System.out.println("월");
                break;
            case TUESDAY:
                System.out.println("화");
                break;
            case WENDESDAY:
                System.out.println("수");
                break;
            case THURSDAY:
                System.out.println("목");
                break;
            case FRIDAY:
                System.out.println("금");
                break;
            case SATURDAY:
                System.out.println("토");
                break;
            default:
                System.out.println("이상한 값이 들어왔나봐요");
                break;
        }
    }
}
