package com.macro.cloud.user.config;


import org.springframework.stereotype.Component;

@Component
public class KgBuildConfig {
    private KgConfig kgConfig;

    public KgConfig getKgConfig() {
        return kgConfig;
    }

    public void setKgConfig(KgConfig kgConfig) {
        this.kgConfig = kgConfig;
    }

    public KgBuildConfig(KgConfig kgConfig) {
        this.kgConfig = kgConfig;
    }
}
