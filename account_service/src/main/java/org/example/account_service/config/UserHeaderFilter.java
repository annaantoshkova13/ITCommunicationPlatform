package org.example.account_service.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserHeaderFilter implements Filter {

    private final UserContext userContext;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        String userId = req.getHeader("x-user-id");

        if (userId != null) {
            userContext.setUserId(Long.parseLong(userId));
            log.debug("Set user ID: {}", userId);
        } else {
            // Вместо ошибки - просто логируем предупреждение
            log.warn("Missing header 'x-user-id'. Request will continue without user context.");
            // Можно установить значение по умолчанию для разработки
            // userContext.setUserId(1L);
        }

        try {
            chain.doFilter(request, response);
        } finally {
            userContext.clear();
        }
    }
}