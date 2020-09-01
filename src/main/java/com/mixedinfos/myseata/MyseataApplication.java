package com.mixedinfos.myseata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = {"com.mixedinfos.myseata.globaltrasictional.dao"})
@EnableSwagger2
public class MyseataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyseataApplication.class, args);
    }

}
