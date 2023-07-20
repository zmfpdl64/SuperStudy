package snow.day3.팀장님지시사항;

public class Sophomore extends YoungGroupCollegeStudent{
    public Sophomore(String studentId, String name, double score) {
        super(studentId, name, score);
    }

    @Override
    public String toString() {
        return "Sophomore" + super.toString();
    }
}
