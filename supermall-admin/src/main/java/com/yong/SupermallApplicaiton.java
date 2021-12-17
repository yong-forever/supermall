package com.yong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@MapperScan("com.yong.system.mapper")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SupermallApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(SupermallApplicaiton.class, args);
    }
}
