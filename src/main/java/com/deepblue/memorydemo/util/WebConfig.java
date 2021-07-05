package com.deepblue.memorydemo.util;

/**
 * 为了满足前后端分离
 * 需要跨域请求的一个全局配置类
 * 这个类为跨域请求做配置
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        /**
         * 1.预访问路径
         * 2.请求来源
         * 3.方法
         * 4.允许携带
         * 5.最大时间
         */
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", "null")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
}
