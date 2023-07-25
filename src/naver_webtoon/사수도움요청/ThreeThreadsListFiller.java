package naver_webtoon.사수도움요청;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeThreadsListFiller {
    private static Integer num = 0;
    public static void main(String[] args) {
        // TODO: 작업할 List 생성
        int listSize = 1000;
        List<Integer> list = Arrays.asList(new Integer[listSize]);

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // TODO: 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(0, list));
        Thread thread2 = new Thread(new ListFillerTask(1, list));
        Thread thread3 = new Thread(new ListFillerTask(2, list));

        // TODO: 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // TODO: 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {
        private int size;
        private List<Integer> lists;

        public ListFillerTask(int size, List<Integer> lists) {
            this.size = size;
            this.lists = lists;
        }
        @Override
        public void run() {
            for(int i = size;  i < lists.size(); i+=3) {
                lists.set(i, size);
            }
        }
    }
}