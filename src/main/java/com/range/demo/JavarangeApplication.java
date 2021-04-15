package com.range.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//启动类添加注解
@EnableSwagger2
@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@ServletComponentScan
public class JavarangeApplication{


    public static void main(String[] args) {
        //logger.info("Starter SpringBoot");
        SpringApplication.run(JavarangeApplication.class, args);
    }

}
