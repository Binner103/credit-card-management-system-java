package com.deepblue.memorydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.deepblue.memorydemo.dao")
@SpringBootApplication
public class MemorydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemorydemoApplication.class, args);
    }

}
