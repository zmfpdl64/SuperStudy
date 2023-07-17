package 네이버클라우드.day4;

import java.lang.reflect.Field;

public class StudentManagementSystem {
    Student[] students;
    int idx = 0;

    public StudentManagementSystem(Integer size) {
        this.students = new Student[size];
    }

    //idx로 현재 최대 idx확인
    public void addStudent(Student student) {
        try {
            students[idx] = student;
            idx += 1;
        }catch(IndexOutOfBoundsException e) {

        }
    }
    // 모든 필드에서 찾으려는 값 조회
    public <T> Student searchStudent(T input){
        for(int i = 0; i < students.length; i++) {
            Student student = students[i];
            try {
                for (Field field : student.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    Object value = field.get(student);
                    if (String.valueOf(value).equals(String.valueOf(input))) {
                        return student;
                    }
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
    // 사용자 삭제
    public void removeStudent(Student student) {
        for(int i =0; i < students.length; i++) {
            if(students[i] == student) {
                for(int j = i; j < students.length-1; j++){
                    students[j] = students[j+1];
                }
                students[idx] = null;
                idx -= 1;
                break;
            }
        }
    }
}

class Student {
    String name;
    Integer studentId;
    String major;
    Integer grade;

    public Student(String name, Integer studentId, String major, Integer grade) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return name + " " + studentId + " " + major + " " + grade;
    }
}
