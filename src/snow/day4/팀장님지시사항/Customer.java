package snow.day4.팀장님지시사항;

public class Customer {
    private String name;
    private int age;
    private String gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
        ", age=" + age +
                ", gender='" + gender + '\'' +
        '}';
    }
}