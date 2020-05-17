package com.syh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication来标注一个主程序
 * 说明这是一个springboot应用
 */
@SpringBootApplication
public class HelloSpringboot {
    public static void main(String[] args) {
        //启动springboot应用
        SpringApplication.run(HelloSpringboot.class, args);

    }
}
