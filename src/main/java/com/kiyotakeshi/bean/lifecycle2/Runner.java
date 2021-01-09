package com.kiyotakeshi.bean.lifecycle2;

import com.kiyotakeshi.bean.lifecycle2.beans.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Bean1 springBean1 = context.getBean(Bean1.class);
        springBean1.sayHello();

        context.close();
    }
}
