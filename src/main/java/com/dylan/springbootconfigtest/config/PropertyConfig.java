package com.dylan.springbootconfigtest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "demo")
@PropertySource("classpath:basicconfig/test.properties")
@Data
@Component
public class PropertyConfig {
    private String name;
    private String body;
}
