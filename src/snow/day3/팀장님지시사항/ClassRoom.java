package snow.day3.팀장님지시사항;

import snow.day1.upcast.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassRoom<T extends CollegeStudent> {
    private String className;
    private List<T> students = new ArrayList<>();

    public ClassRoom(String className) {
        this.className = className;
    }

    public void addStudent(T student) {
        students.add(student);
    }
    public T getStudentByStudentNumber(String studentId) {
        return students.stream().filter(i -> studentId.equals(i.getStudentId())).findFirst().orElse(null);
    }

    public void printStudentNames() {
        presentClassRoom();
        System.out.println(students.stream().map(CollegeStudent::getName).collect(Collectors.toList()) + "가 있습니다.");
    }

    public void presentClassRoom() {
        System.out.println("이 클래스 룸(" + this.className + ")은 학생들");
    }
}
