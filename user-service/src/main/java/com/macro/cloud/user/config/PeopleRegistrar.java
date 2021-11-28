package com.macro.cloud.user.config;

import com.macro.cloud.user.domain.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

public class PeopleRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Person.class);
        rootBeanDefinition.setInstanceSupplier(PeopleRegistrar::getPerson);
        Arrays.stream(registry.getBeanDefinitionNames()).forEach(c -> System.out.println(c));
        registry.registerBeanDefinition("peopleFromSupplier1", rootBeanDefinition);
    }

    public static Person getPerson() {
        return new Person();
    }
}
