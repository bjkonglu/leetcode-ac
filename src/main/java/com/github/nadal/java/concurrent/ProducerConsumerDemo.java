package com.github.nadal.java.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Author: lukong
 * Date: 2019-03-17
 * Description:
 */
public class ProducerConsumerDemo {

    private static BlockingQueue<String> queue = new LinkedBlockingDeque<>();

    private static class Producer extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                queue.put("producer");
            } catch (InterruptedException e) {
                e.getCause();
            }
            System.out.println("producer->");
        }
    }

    private static class Consumer extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                String message = queue.take();
                System.out.println("consumer:" + message);

            } catch (InterruptedException e) {
                e.getCause();
            }
            System.out.println("consumer->");
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            Producer producer = new Producer();
            producer.start();
        }

        for (int j=0; j<4; j++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
    }
}
