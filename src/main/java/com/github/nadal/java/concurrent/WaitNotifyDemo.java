package com.github.nadal.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: lukong
 * Date: 2019-03-17
 * Description:
 */
public class WaitNotifyDemo {

    public synchronized void before() {
        System.out.println("before");
        notifyAll();
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("after");
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyDemo elem = new WaitNotifyDemo();

        executorService.execute(() -> elem.after());
        executorService.execute(() -> elem.before());

        executorService.shutdown();
    }
}
