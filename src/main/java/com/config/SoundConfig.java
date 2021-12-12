package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Order(1)
public class SoundConfig {

    @ConfigurationProperties(prefix = "ftp")
    @Bean(name = "FtpProperties")
    public FtpProperties ftpProperties() {
        return new FtpProperties();
    }
}
