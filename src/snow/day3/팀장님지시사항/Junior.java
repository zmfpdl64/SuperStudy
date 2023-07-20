package snow.day3.팀장님지시사항;

public class Junior extends ElderGroupCollegeStudent{
    public Junior(String studentId, String name, double score) {
        super(studentId, name, score);
    }

    @Override
    public String toString() {
        return "Junior" + super.toString();
    }
}
