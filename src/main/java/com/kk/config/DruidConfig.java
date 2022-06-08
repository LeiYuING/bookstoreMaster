package com.kk.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();//设置默认数据源
    }

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>();
//
//        HashMap<String, String> initParameters = new HashMap<>();
//        initParameters.put("username","admin");//设置druid管理界面登陆用户名
//        initParameters.put("password","123456");//设置druid管理界面登陆密码
//
//        bean.setInitParameters(initParameters);
//
//        return bean;
//    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();

        bean.setFilter(new WebStatFilter());

        HashMap<String,String> initParameters = new HashMap<>();
        initParameters.put("excusions","*.js,*.css,/druid/*");//设置过滤请求

        bean.setInitParameters(initParameters);

        return bean;

    }
}
