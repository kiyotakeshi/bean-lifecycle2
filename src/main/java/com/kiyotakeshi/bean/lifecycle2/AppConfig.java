package com.kiyotakeshi.bean.lifecycle2;

import com.kiyotakeshi.bean.lifecycle2.beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(initMethod = "initialization", destroyMethod = "destruction")
    public Bean1 springBean1() {
        return new Bean1();
    }
}
