package 스노우.day1.팀장님지시사항.part2;

import 스노우.day1.upcast.C;

public class SuperUser extends User implements AdminRole, CustomerRole, ReviewerRole {
    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void manageUsers() {
        System.out.println("슈퍼유저("+this.username+")은 유저를 매니징 할 수 있습니다.");
    }

    @Override
    public void changeSettings() {
        System.out.println("슈퍼유저("+this.username+")은 세팅을 변경할 수 있습니다.");
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
