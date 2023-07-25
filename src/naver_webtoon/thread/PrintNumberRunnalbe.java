package naver_webtoon.thread;

public class PrintNumberRunnalbe implements Runnable{
    int start;
    int end;

    public PrintNumberRunnalbe(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        for(int i = start; i < end; i++) {
            System.out.printf("%d ", i);
        }
    }
}
