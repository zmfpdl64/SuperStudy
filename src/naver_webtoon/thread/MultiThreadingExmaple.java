package naver_webtoon.thread;

public class MultiThreadingExmaple {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // 1) 1~100까지 출력하는데, Multi threading 1부터 100까지 출력
        PrintNumberRunnalbe runnalbe = new PrintNumberRunnalbe(1, 50);
        PrintNumberRunnalbe runnalbe2 = new PrintNumberRunnalbe(50, 101);

        Thread thread = new Thread(runnalbe);
        Thread thread2 = new Thread(runnalbe2);
        thread.start();
        thread2.start();

        long end = System.nanoTime();
        System.out.println("걸린시간: " + (end - start));


    }
}
