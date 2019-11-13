package com.cskaoyan.config;

import com.cskaoyan.intececptor.CustomHandlerInterceptor;
import com.cskaoyan.intececptor.String2DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.cskaoyan")
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CustomHandlerInterceptor()).addPathPatterns("/hello/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pic/**").addResourceLocations("classpath:/jpg/");
    }

    @Autowired
    ConfigurableConversionService configurableConversionService;
    @Bean
    @Primary
    public ConfigurableConversionService conversionService(){
        return configurableConversionService;
    }
    @PostConstruct
    public void addCustomConverter(){
        System.out.println(configurableConversionService);
        configurableConversionService.addConverter(new String2DateConverter());
    }


}
