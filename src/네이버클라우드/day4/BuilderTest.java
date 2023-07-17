package 네이버클라우드.day4;

import java동아리.빌더스위치연습.BuilderClass;

public class BuilderTest {
    public static void main(String[] args) {
        BuilderClass obj = BuilderClass.builder("name")
                                .setAge(10)
                                .setMessage("message")
                                .build();

        BuilderClass obj2 = BuilderClass.builder("name2")
                                .build();

        System.out.println(obj.toString());
        System.out.println(obj2.toString());

        StaticClass.Static aStatic = StaticClass.createStatic();

        Pizza pizza = new Pizza.Builder()
                .topping("topping")
                .size(5)
                .build();


    }
}
