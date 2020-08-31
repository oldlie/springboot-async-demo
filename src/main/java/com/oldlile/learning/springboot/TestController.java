package com.oldlile.learning.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CL
 * @date 2020/8/31
 */
@RestController
public class TestController {

    @Autowired
    private AsyncTaskService asyncTask;

    @RequestMapping("/task")
    public String doTask() throws Exception {
        long start = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        return (System.currentTimeMillis() - start) + "ms";
    }
}
