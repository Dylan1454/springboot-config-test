package com.dylan.springbootconfigtest.service;

import com.dylan.springbootconfigtest.config.PropertyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
//@EnableConfigurationProperties(PropertyConfig.class)
public class TestService {
    @Autowired
    @Qualifier("propertyConfig")
    private PropertyConfig config;

    public String sayHello()
    {
        return config.getName()+config.getBody();
    }
}
