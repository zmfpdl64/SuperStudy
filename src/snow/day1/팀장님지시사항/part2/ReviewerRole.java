package snow.day1.팀장님지시사항.part2;

public interface ReviewerRole {
    default void writeReview(){
        System.out.println("ReviewRole을 맡아서 리뷰 작성할 수 있습니다.");
    }
    default void giveRating(){
        System.out.println("ReviewRole을 맡아서 점수 평가할 수 있습니다.");
    }

}
