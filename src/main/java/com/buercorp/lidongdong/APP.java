package com.buercorp.lidongdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
@MapperScan("com.buercorp.lidongdong.mapper")
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }

}
