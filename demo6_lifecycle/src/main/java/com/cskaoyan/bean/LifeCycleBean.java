package com.cskaoyan.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    String properties;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        System.out.println("set方法");
        this.properties = properties;
    }

    public LifeCycleBean() {
        System.out.println("1、构造方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3、beannameAware:" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4、beanFactoryAware:" + beanFactory);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(6 + "、afterPropertyset");
    }

    public void myinit(){
        System.out.println("7、init");
    }
    public void mydestory(){
        System.out.println("10、destory");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9、destory");
    }
}
