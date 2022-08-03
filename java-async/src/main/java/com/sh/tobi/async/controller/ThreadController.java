package com.sh.tobi.async.controller;


import cn.hutool.core.lang.Console;
import com.sh.tobi.async.service.ThreadService;
import com.sh.tobi.async.trhread.MyCallable;
import com.sh.tobi.async.trhread.MyRunnable;
import com.sh.tobi.async.trhread.MyThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import static java.lang.Thread.sleep;

@RestController
public class ThreadController {

    @Autowired
    private ThreadService threadService;


    @GetMapping("start")
    public int start() {
        int count = threadService.startCount();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 让线程睡眠一会
                try {
                    System.out.println("开始更新..");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int total = threadService.changeStartCount();
                System.out.println("更新数量：" + total);
            }
        });
        thread.start();
        return count;
    }

    @GetMapping("thread2")
    public int thread2() {

        CountDownLatch countDownLatch=new CountDownLatch(2);

        int count = threadService.startCount();

        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // 让线程睡眠一会
                    try {
                        System.out.println("开始更新..");
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int total = threadService.changeStartCount();
                    System.out.println("更新数量：" + total);

                    countDownLatch.countDown();
                }
            });
            thread.start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Console.log("执行完成");
        return count;
    }

    @GetMapping("thread3")
    public int thread3() {

        CountDownLatch countDownLatch=new CountDownLatch(2);
        int count = threadService.startCount();

        for (int i = 0; i < 2; i++) {
            MyThread myThread = new MyThread(countDownLatch);
            myThread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Console.log("主线程执行完成");
        return count;
    }

    @GetMapping("thread4")
    public int thread4() {

        int count = threadService.startCount();

        for (int i = 0; i < 2; i++) {
            MyRunnable myRunnable = new MyRunnable();
            Thread thread=new Thread(myRunnable);
            thread.start();
        }

        Console.log("主线程执行完成");
        return count;
    }

    @GetMapping("thread5")
    public int thread5() {
        int count = threadService.startCount();
        new Thread(()->{
            try {
                System.out.println("子线程执行中......");
                sleep(3000);
                System.out.println("子线程执行完毕 -1");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        Console.log("主线程执行完成");
        return count;
    }

    @GetMapping("thread6")
    public int thread6() {
        int count = threadService.startCount();

        for (int i = 0; i < 2; i++) {
            MyCallable myCallable=new MyCallable();
            FutureTask<Boolean> futureTask=new FutureTask<>(myCallable);
            Thread thread=new Thread(futureTask);
            thread.start();
        }
        Console.log("主线程执行完成");
        return count;
    }
}
