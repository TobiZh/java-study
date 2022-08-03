package com.sh.tobi.async.trhread;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("子线程执行中......");
            sleep(3000);
            System.out.println("子线程执行完毕 -1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
