package snow.day3;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        //Add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");
        fruitSet.add("Apple");

        System.out.println(fruitSet.toString());

        //remove(key)
        fruitSet.remove("Apple");
        System.out.println("fruitSet: " + fruitSet);

        //contains(key)
        System.out.println(fruitSet.contains("Mango"));

        // Size, isEmpty, Clear
        System.out.println(fruitSet.size());
        System.out.println(fruitSet.isEmpty());
        fruitSet.clear();
        System.out.println(fruitSet.size());

    }
}
