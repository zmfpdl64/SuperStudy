package java동아리.참조null;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {
        weakHashMap();
        hashMap();
    }
    public static void weakHashMap(){
        WeakHashMap<Integer, String> map = new WeakHashMap<>();
        Integer num1 = new Integer(10);
        String str1 = new String("str1");
        Integer num2 = new Integer(20);
        String str2 = new String("str2");
        map.put(num1, str1);
        map.put(num2, str2);

        System.out.println("WeakHashMap key참조해제전: " + map.toString());
        num1 = null;
        System.gc();
        System.out.println("WeakHashMap key참조해제후: " + map.toString());
    }

    public static void hashMap() {
        HashMap<Integer, String> map = new HashMap<>();
        Integer num1 = new Integer(10);
        String str1 = new String("str1");
        Integer num2 = new Integer(20);
        String str2 = new String("str2");
        map.put(num1, str1);
        map.put(num2, str2);

        System.out.println("hashMap key참조해제전: " + map.toString());
        num1 = null;
        System.gc();
        System.out.println("HashMap key참조해제후: " + map.toString());
    }
}
