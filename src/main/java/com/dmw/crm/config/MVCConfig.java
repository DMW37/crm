package com.dmw.crm.config;

import com.dmw.crm.interceptor.NoLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Resource
    private NoLoginInterceptor noLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(noLoginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login","/index","/css/**","/js/**","/images/**","/lib/**");
    }
}
