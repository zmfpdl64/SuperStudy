package snow.day1.팀장님지시사항.part2;

public class UserManageSystem {
    public static void main(String[] args){

        User[] users = new User[]{
                new GeneralUser("김지민 "), new GeneralUser("이승우"), new GeneralUser("박현주"),
                new ReviewerUser("정민재"), new ReviewerUser("강지현"),
                new SuperUser("임서연"), new SuperUser("한민수")
        };

        for(User user: users){
            if (user instanceof CustomerRole){
                ((CustomerRole) user).order();
                ((CustomerRole) user).payment();
            }

            if (user instanceof ReviewerRole){
                ((ReviewerRole) user).writeReview();
                ((ReviewerRole) user).giveRating();
            }

            if (user instanceof AdminRole){
                ((AdminRole) user).manageUsers();
                ((AdminRole) user).changeSettings();
            }
        }
    }

}
