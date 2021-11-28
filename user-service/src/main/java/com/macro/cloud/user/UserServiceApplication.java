package com.macro.cloud.user;

import com.macro.cloud.user.config.KgBuildConfig;
import com.macro.cloud.user.config.KgConfig;
import com.macro.cloud.user.domain.Person;
import com.macro.cloud.user.domain.User;
import com.macro.cloud.user.service.UserInterface;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;


@EnableDiscoveryClient
@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(UserServiceApplication.class);
        KgConfig kgConfig = applicationContext.getBean(KgConfig.class);
        KgBuildConfig kgBuildConfig = applicationContext.getBean(KgBuildConfig.class);
        Person person = applicationContext.getBean(Person.class);
        UserInterface userInterface = applicationContext.getBean(UserInterface.class);

        System.out.println(kgBuildConfig.getKgConfig().toString());
        System.out.println(kgConfig.toString());
        System.out.println(kgConfig.toString());
        System.out.println(person.toString());
    }

}
