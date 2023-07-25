package naver_webtoon.design_pattern.builder;

public class Customer {
    private String name;
    private int age;
    private String gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Customer(CustomerBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }
    public Customer(String name) {
        this.name = name;
    }
    public Customer() {}


    static class CustomerBuilder{
        private String name;
        private int age;
        private String gender;

        public CustomerBuilder() {
        }
        public CustomerBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public CustomerBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public CustomerBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
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