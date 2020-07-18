package com.itjiayan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itjiayan.mapper")
public class BeiwangluApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeiwangluApplication.class, args);
    }

}
