package com.wp.app.configer;

import com.wp.app.componte.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class MainConfiger {

    @Bean
    public LocaleResolver myLocaleResolver() {
        return new MyLocaleResolver();
    }
}
