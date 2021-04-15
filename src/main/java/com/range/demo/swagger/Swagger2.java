package com.range.demo.swagger;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {
    //http://blog.didispace.com/springbootswagger2/
    @Bean
    public Docket createRestApi() {
        //解决basic-error-controller
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()//选择哪些路径和api生成document
                .apis(RequestHandlerSelectors.any())
                // 不显示错误的接口地址
                .paths(Predicates.not(PathSelectors.regex("/error.*")))// 错误路径不监控
                .apis(RequestHandlerSelectors.basePackage("com.range.demo.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Java Range API 文档")
                .contact(new Contact("cor0ps", "http://cor0ps.gitee.io", ""))
                .description("漏洞仅仅做安全研究使用！")
                .version("1.0")
                .build();

    }


}
