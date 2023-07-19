package snow.day3;

import java.util.HashMap;
import java.util.Map;

public class HashInterfaceTest {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Orange", 5);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 3);
        fruitMap.put("Kiwi", 20);

        // Get(key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("AppleCount: " + appleCount);
        System.out.println("BananaCount: " + bananaCount);

        // containsKey(keh)
        System.out.println(fruitMap.containsKey("Apple"));

        // size
        System.out.println(fruitMap.size());

        // keySet()
        System.out.println(fruitMap.keySet());

        // values()
        System.out.println(fruitMap.values());

        // entiry()

        System.out.println(fruitMap.entrySet());



        System.out.println("fruitMap: " + fruitMap.toString());
    }
}
