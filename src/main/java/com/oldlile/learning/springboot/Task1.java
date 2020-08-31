package com.oldlile.learning.springboot;

/**
 * @author CL
 * @date 2020/8/31
 */
public class Task1 implements AsyncTask {

    @Override
    public void execute() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println("Task1 consume:" + (System.currentTimeMillis() - start) + "ms");
    }
}
