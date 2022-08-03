package com.sh.tobi.async.trhread;

import java.util.concurrent.Callable;

import static java.lang.Thread.sleep;

public class MyCallable implements Callable {
    @Override
    public Boolean call() throws Exception {
        System.out.println("子线程执行中："+Thread.currentThread().getName());
        sleep(3000);
        System.out.println("子线程执行完毕 -1");
        return true;
    }
}
