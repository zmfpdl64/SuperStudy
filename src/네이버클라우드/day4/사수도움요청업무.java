package 네이버클라우드.day4;

import java.util.Arrays;

public class 사수도움요청업무 {
    public static void main(String[] args) {
        solution1(new int[]{1,2,3,4,5,6});
        solution1(new int[]{58,172,746,89});
        solution1(new int[]{9,8,7});
        solution1(new int[]{11, 22, 33, 44, 55, 66, 77, 88,99, 1111,2222,333, 4444, 2222,333, 4444 ,2222,333, 4444, 2222,333, 4444, 2222,333, 4444});
    }
    public static void solution1(int[] arr) {
        int size = arr.length;
        int idx = 1;
        while(size > idx) {
            idx *= 2;
        }
        int[] newArr = new int[idx];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(int i = arr.length+1; i < idx; i++) {
            newArr[i] = 0;
        }
        Arrays.stream(newArr).forEach(i -> System.out.printf("%d ", i));
        System.out.println();
    }
}
