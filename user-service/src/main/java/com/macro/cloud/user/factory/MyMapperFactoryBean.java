package com.macro.cloud.user.factory;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MyMapperFactoryBean<T> implements FactoryBean<T>  {
    private Class<T> mapperInterface;

    public MyMapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] { mapperInterface }, new MyMapperProxy<>());
    }

    @Override
    public Class<?> getObjectType() {
        return this.mapperInterface;
    }
}
