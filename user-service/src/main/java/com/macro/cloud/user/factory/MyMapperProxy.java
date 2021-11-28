package com.macro.cloud.user.factory;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyMapperProxy<T> implements InvocationHandler, Serializable {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sayHello")) {
            System.out.println("hello world!");
        } else {
            System.out.println(method.getName());
        }
        return method.getName();
    }
}
