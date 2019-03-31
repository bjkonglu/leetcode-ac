package com.github.nadal.java.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: lukong
 * Date: 2019-03-24
 * Description:
 */
public class ThreadUnsafeExample {
    private int cnt = 0;

    public synchronized void add() {
        cnt ++;
    }

    public synchronized int get() {
        return cnt;
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        int THREAD_NUM = 1000;
        CountDownLatch latch = new CountDownLatch(THREAD_NUM);

        for (int i = 0; i < THREAD_NUM; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    example.add();
                    latch.countDown();
                }
            });
        }
        latch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }
}
