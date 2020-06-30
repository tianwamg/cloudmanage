package com.cn.client.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfiguration {

    @Bean
    public WebMvcConfigurer crsConfigurer(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**");
            }

//            @Override
//            public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//                super.addArgumentResolvers(argumentResolvers);
//                argumentResolvers.add(new MyStringArgumentResolver());
//
//            }
        };
    }
}
