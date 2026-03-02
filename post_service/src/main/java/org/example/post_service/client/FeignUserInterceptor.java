package org.example.post_service.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.example.post_service.config.UserContext;

@RequiredArgsConstructor
public class FeignUserInterceptor implements RequestInterceptor {

    private final UserContext userContext;
    @Override
    public void apply(RequestTemplate template) {
        template.header("x-user-id", String.valueOf(userContext.getUserId()));
    }
}
