package org.example.post_service;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients(basePackages = "org.example.post_service")
public class PostServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PostServiceApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
