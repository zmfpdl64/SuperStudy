package snow.day3.팀장님지시사항;

public class Senior extends ElderGroupCollegeStudent{

    public Senior(String studentId, String name, double score) {
        super(studentId, name, score);
    }

    @Override
    public String toString() {
        return "Senior" + super.toString();
    }
}
