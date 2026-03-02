package org.example.project_service.client;

import org.example.project_service.dto.PaymentRequest;
import org.example.project_service.dto.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", url = "${services.payment-service.host}:${services.payment-service.port}")
public interface PaymentServiceClient {

    @PostMapping("/api/payment")
    PaymentResponse sendPayment(@RequestBody PaymentRequest paymentRequest);
}
