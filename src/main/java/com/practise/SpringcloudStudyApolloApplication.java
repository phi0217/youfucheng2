package com.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@SpringBootApplication(scanBasePackages="com.practise.yfc.controller")
@EnableApolloConfig
@EnableEurekaClient
public class SpringcloudStudyApolloApplication {

    public static void main(String[] args) {
    	//System.setProperty("apollo.configService", "http://localhost:8080");
        SpringApplication.run(SpringcloudStudyApolloApplication.class, args);
    }
}

