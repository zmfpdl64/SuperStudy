package 네이버클라우드.day1;

public class ChuncheonTicket2 {
    public static void main(String[] args) {
        solution1();
        solution2();
    }

    public static void solution1(){
        int freeTickets = 1111;
        System.out.println("티겟을 가져갈 수 있는 근무자들 수는? "+ (int) freeTickets/4  );
        System.out.println("티켓을 다 나눠주고, 남은 티켓 수는? " + freeTickets%4);
    }

    public static void solution2() {
        /**
         * Q) 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
         * 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
         * Alice(나이: 70, 나라: 미국)
         * Kim (나이: 65, 나라: 한국)
         * Yoo (나이: 42, 나라: 한국)
         */

        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        System.out.println("Alice는 적용 대상자인가?");
        if(ageOfAlice >= 65 && countryOfAlice.equals("Korea")){
            System.out.println("Alice는 적용 대상자입니다.");
        }else{
            System.out.println("Alice는 적용 대상자가 아닙니다.");
        }
        System.out.println("Kim는 적용 대상자인가?");
        if(ageOfKim >= 65 && countryOfKim.equals("Korea")){
            System.out.println("Kim는 적용 대상자입니다.");
        }else {
            System.out.println("Kim은 적용 대상자가 아닙니다.");
        }
        System.out.println("Yoo는 적용 대상자인가?");
        if(ageOfYoo >= 65 && countryOfYoo.equals("Korea")){
            System.out.println("Yoo는 적용 대상자입니다.");
        }else{
            System.out.println("Yoo는 적용 대상자가 아닙니다.");
        }

    }
}
