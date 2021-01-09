package com.kiyotakeshi.bean.lifecycle2.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // spring gives you ability to access any of the bean definition
        // var springBean1 = configurableListableBeanFactory.getBeanDefinition("springBean1");
        System.out.println(getClass().getSimpleName() + " postProcessBeanFactory");
    }
}
