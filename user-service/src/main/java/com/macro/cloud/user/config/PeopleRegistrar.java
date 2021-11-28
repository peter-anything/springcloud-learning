package com.macro.cloud.user.config;

import com.macro.cloud.user.domain.Person;
import com.macro.cloud.user.factory.MyMapperFactoryBean;
import com.macro.cloud.user.mapper.UserMapper;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

public class PeopleRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(MyMapperFactoryBean.class);
        rootBeanDefinition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);

        registry.registerBeanDefinition("userMapper", rootBeanDefinition);
    }
}
