package com.macro.cloud.user;

import com.macro.cloud.user.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;


@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.macro.cloud.user.mapper")
public class UserServiceApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(UserServiceApplication.class);
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        userMapper.sayHello();
        System.out.println(userMapper);
    }

}
