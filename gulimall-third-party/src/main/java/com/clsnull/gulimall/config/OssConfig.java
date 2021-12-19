package com.clsnull.gulimall.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OssConfig {

    @Value("${alibaba.oss.access-key}")
    private String accessKey;

    @Value("${alibaba.oss.secret-key}")
    private String secretKey;

    @Value("${alibaba.oss.endpoint}")
    private String endPoint;

    @Bean
    public OSS ossClient() {
        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKey, secretKey);
        return ossClient;
    }
}
