package com.example.alibabDemo.nacosConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：Zhang
 * @ Date       ：Created in 17:14 2020/9/27
 * @ Description：
 */
@Component
public class PrintApplicationRunner implements ApplicationRunner {

    @Autowired
    private User user;
    @Override
    public void run(ApplicationArguments args) throws Exception {
       // System.out.println(user.);
        System.out.println(user.getUserName());
    }
}
