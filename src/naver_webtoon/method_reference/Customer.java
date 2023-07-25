package naver_webtoon.method_reference;

public class Customer {
    private String name;
    private int age;
    private String gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Customer() {

    }
    public Customer(String name) {
        this.name = name;
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