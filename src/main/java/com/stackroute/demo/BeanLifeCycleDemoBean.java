package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements DisposableBean, InitializingBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterpropertiesset method");
    }

    public void start(){
        System.out.println("started");
    }
    public void end(){
        System.out.println("ended");
    }

}
