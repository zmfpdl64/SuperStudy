package naver_webtoon.thread;

public class JavaMultiThreadingIssue {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread = new Thread(new IncrementRunnable(counter));
        Thread thread2 = new Thread(new IncrementRunnable(counter));
        Thread thread3 = new Thread(new IncrementRunnable(counter));
        thread.start();
        thread2.start();
        thread3.start();
    }
}
