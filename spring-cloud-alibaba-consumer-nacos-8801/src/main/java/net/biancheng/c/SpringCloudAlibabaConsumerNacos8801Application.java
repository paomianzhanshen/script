package net.biancheng.c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaConsumerNacos8801Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConsumerNacos8801Application.class, args);
    }
}
