package snow.day5.stream;

import snow.day1.upcast.A;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // Stream of, Arrays.Stream, Collection(=List) -> Stream
        Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);

        //Arrays.Stream
        Stream<String> fruits2 = Arrays.stream(new String[] {"Apple", "Banaan", "Orange"});
        Stream<Integer> integerStream2 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,10});

        //Collection
        List<String> fruits3 = new ArrayList<>(
                List.of(
                        "Apple", "Banana", "Orange", "Mango", "Grapes"
                )
        ) ;
        List<Integer> integerStream3 = new ArrayList<>(
                List.of(
                        1,2,3,4,5,6,7,8,9,10
                )
        );
        //Stream 가지고 for-loop
        Stream<Integer> stream = integerStream3.stream();

        //Stream은 재사용이 불가능하다
        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);


        fruits.forEach(System.out::println);
        integerStream.filter(i -> i % 2 == 0).forEach(System.out::println);


        //forEach
        fruits3.stream().forEach(System.out::println);
        // 2. collect
        Set<String> collect = fruits3.stream().collect(Collectors.toSet());
        System.out.println("set: " + collect);
        // 3. findFirst()
        Optional<String> first = fruits3.stream().findFirst();
        System.out.println("optional: " + first.orElseGet(() -> ""));
        // 4. sum()
        System.out.println("sum: " + integerStream3.stream().mapToInt(i -> i).sum());

        // 5. average()
        System.out.println("average: " + integerStream3.stream().mapToInt(i -> i).average().getAsDouble());

        // 6. count()
        System.out.println("count: " + fruits3.stream().count());

        // 7. max(), min()
        System.out.println("max: " + integerStream3.stream().mapToInt(i -> i).max());
        System.out.println("min: " + integerStream3.stream().mapToInt(i -> i).min());

        // 8. reduce()
        System.out.println("reduce: " + integerStream3.stream().reduce(0, (int1, int2) -> int1 - int2));



    }
}
