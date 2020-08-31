package com.oldlile.learning.springboot;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author CL
 * @date 2020/8/31
 */
@Component
public class AsyncTaskService {

    @Async
    public void task1() throws InterruptedException {
        new Task1().execute();
        // print("Task1 consume:", start);
    }

    @Async
    public void task2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        print("Task2 consume:", start);
    }

    @Async
    public void task3() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(3000);
        print("Task3 consume:", start);
    }

    private void print(String msg, long start) {
        System.out.println(msg + (System.currentTimeMillis() - start) + "ms");
    }
}
