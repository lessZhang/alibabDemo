package com.example.alibabDemo.nacosConfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：Zhang
 * @ Date       ：Created in 17:10 2020/9/27
 * @ Description：
 */
@ConfigurationProperties(prefix = "user")
@Component
@Data
public class User {

    private String userName;

}
