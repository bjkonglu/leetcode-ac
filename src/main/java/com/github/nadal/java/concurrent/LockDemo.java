package com.github.nadal.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author: lukong
 * Date: 2019-03-17
 * Description:
 */
public class LockDemo {
    private Lock lock = new ReentrantLock(true);

    public void func() {
        lock.lock();
        try {
            for(int i=0; i<10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        LockDemo elem = new LockDemo();
        executorService.execute(elem::func);
        executorService.execute(elem::func);

        executorService.shutdown();
    }
}
