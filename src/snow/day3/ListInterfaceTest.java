package snow.day3;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        //List 정의
        List<String> fruitList = new ArrayList<>();

        //add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println("FruitList 요소: "+ fruitList.toString());

        // add(index, element)
        fruitList.add(3, "Mango");

        System.out.println("FruitList 요소: "+ fruitList.toString());

        // remove(index)
        fruitList.remove(3);

        System.out.println("FruitList 요소: "+ fruitList.toString());

        // get(index)
        String kiwi = fruitList.get(3);
        System.out.println("가져온 과일은: " + kiwi);

        // set(Index, Element)
        String pineApple = "PineApple";
        fruitList.set(1, pineApple);

        System.out.println("FruitList 요소: "+ fruitList.toString());

        System.out.println("리스트 사이즈: " + fruitList.size());
        System.out.println("리스트 비어있는지 확인 : " + fruitList.isEmpty());

        System.out.println("키위가 현재 존재하나요? :" + fruitList.contains(kiwi));


    }
}
