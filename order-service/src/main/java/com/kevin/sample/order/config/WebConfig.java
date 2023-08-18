package com.kevin.sample.order.config;


import com.kevin.sample.common.interceptor.SeataXidInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer  {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StatusToEnumConverter<>());

    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SeataXidInterceptor());
    }
}
