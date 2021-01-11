package com.kiyotakeshi.bean.lifecycle2.beans;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {

    public Bean2() {
        System.out.println("\nCreating " + getClass().getSimpleName());
    }
}
