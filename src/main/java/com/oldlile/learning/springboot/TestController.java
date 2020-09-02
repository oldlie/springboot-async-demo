package com.oldlile.learning.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

/**
 * @author CL
 * @date 2020/8/31
 */
@RestController
@Validated
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

    @RequestMapping("/validation")
    public String validation(@Size(max = 2, message = "max size 2") @RequestParam("t") String title) throws Exception {
        return title;
    }
}
