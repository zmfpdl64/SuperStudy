package snow.day3.팀장님지시사항;

public class Freshman extends YoungGroupCollegeStudent {

    public Freshman(String studentId, String name, double score) {
        super(studentId, name, score);
    }

    @Override
    public String toString() {
        return "Freshman" + super.toString();
    }
}
