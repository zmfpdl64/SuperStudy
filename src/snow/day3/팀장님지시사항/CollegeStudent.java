package snow.day3.팀장님지시사항;

abstract class CollegeStudent {

    private String studentId;
    private String name;
    private double score;

    public CollegeStudent(String studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{studentNumber='"+this.studentId+"', name='" + this.name + "', gpa=" + this.score + "}";
    }
}