package io.concurrency.chapter02.exam02;

public class ThreadStartRunExample {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " :스레드 실행중..");
            }
        });

        thread.start();     // start를 통해 정의한 작업이 진행된다.
//        thread.run();
//        myRunnable.run();

        System.out.println(Thread.currentThread().getName() + " : 스레드 종료..");
    }

    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": 스레드 실행 중...");
        }
    }
}
