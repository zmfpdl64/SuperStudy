package 스노우.day1.팀장님지시사항.part2;

public class ReviewerUser extends User implements ReviewerRole, CustomerRole{
    public ReviewerUser(String username) {
        super(username);
    }

    @Override
    public void order() {
        System.out.println("유저("+this.username+")은 주문을 할 수 있습니다.");
    }

    @Override
    public void payment() {
        System.out.println("유저("+this.username+")은 결제를 할 수 있습니다.");
    }
}
