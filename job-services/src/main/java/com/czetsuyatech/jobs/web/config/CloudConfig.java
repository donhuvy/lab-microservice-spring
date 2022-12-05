package com.czetsuyatech.jobs.web.config;

import com.czetsuyatech.jobs.Job;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackageClasses = {Job.class})
public class CloudConfig {

}
