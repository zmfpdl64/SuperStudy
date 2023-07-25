package naver_webtoon.annotation;

import naver_webtoon.annotation.meta.MyAnnotation;

public class Customer {
    private String name;
    private int age;
    private String gender;

    @Override
    @MyAnnotation(name = "Equal")
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

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

    @MyAnnotation(name="소비자 정보")
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
        ", age=" + age +
                ", gender='" + gender + '\'' +
        '}';
    }
}