package naver_webtoon.thread;

public class JavaThreading {
    public static void main(String[] args) {
        //Thread 실행
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(() -> System.out.println("Thread " + Thread.currentThread().getName() + ": 실행하고 있습니다."));
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread " + Thread.currentThread().getName() + ": 실행하고 있습니다.");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println();
        System.out.println("Thread " + Thread.currentThread().getName() + ": 실행하고 있습니다.");
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread " + Thread.currentThread().getName() + ": 실행하고 있습니다.");
        }
    }
}
