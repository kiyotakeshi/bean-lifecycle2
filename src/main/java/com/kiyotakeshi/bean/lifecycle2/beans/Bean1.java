package com.kiyotakeshi.bean.lifecycle2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean1 implements InitializingBean, DisposableBean {

    private Bean2 Bean2;

    public Bean1() {
        System.out.println("\nCreating " + getClass().getSimpleName());
    }

    public void sayHello() {
        System.out.println("\nHello\n");
    }

    @Autowired
    public void setBean2(Bean2 bean2) {
        System.out.println("settingProperty on " + getClass().getSimpleName() + " to inject " + bean2.getClass().getSimpleName());
        this.Bean2 = bean2;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("@PostConstruct " + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy " + getClass().getSimpleName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean::afterPropertiesSet " + getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean::destroy " + getClass().getSimpleName());
    }

    private void initialization() {
        System.out.println("@Bean(initMethod) " + getClass().getSimpleName());
    }

    private void destruction() {
        System.out.println("@Bean(destroyMethod) " + getClass().getSimpleName());
    }
}
