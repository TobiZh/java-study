package com.sh.tobi.async.trhread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread{

    private CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        try {
            System.out.println("子线程执行中......");
            sleep(3000);
            countDownLatch.countDown();
            System.out.println("子线程执行完毕 -1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
