package naver_webtoon.thread;

public class IncrementRunnable implements Runnable{
    private Counter counter;

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter.increment();
            System.out.println("Count: " + counter.getCount());
        }
    }
}
