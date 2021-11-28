package com.macro.cloud.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@Import(PeopleRegistrar.class)
public class KgConfig {
    private String host;
    private String port;
}
