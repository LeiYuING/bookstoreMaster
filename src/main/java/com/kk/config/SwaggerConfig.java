package com.kk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    //配置了swagger的Docket的bean实施
    @Bean
    public Docket docket3(Environment environment){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("雷宇")
                .apiInfo(apiInfo())
                //enable()是否启动swagger
                .select()
                //RequestHandlerSelectors,配置要扫描接口的方式
                //basePackage:指定要扫描的包
                //any():扫描全部
                //none():不扫描
                //withClassAnnotation:扫描类上的注解，参数是一个注解的反射对象
                //withMethodAnnotation:扫描方法上的注解
                .paths(PathSelectors.ant("/**"))//允许某些请求
                .build();
    }
    //配置swagger信息=apiInfo
    public ApiInfo apiInfo(){
        return new ApiInfo("雷宇", "大帅哥", "1.0", "https://www.baidu.com/index.php?tn=monline_3_dg", new Contact("leiyu", "https://home.firefoxchina.cn/", "1259702047@qq.com"), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
}
