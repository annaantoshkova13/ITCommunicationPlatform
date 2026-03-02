package org.example.url_shortener_service;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients("org.example.url_shortener_service")
public class UrlShortenerServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UrlShortenerServiceApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
