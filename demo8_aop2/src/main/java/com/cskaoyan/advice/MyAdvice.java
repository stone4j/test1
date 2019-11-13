package com.cskaoyan.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");
        Object[] arguments = methodInvocation.getArguments();
        arguments[0] = arguments[0] + " modified";
        Object proceed = methodInvocation.proceed();
        System.out.println("after");
        return proceed;
    }
}
