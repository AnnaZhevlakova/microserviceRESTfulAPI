package com.example.BFFService.service;

import com.example.BFFService.models.Order;
import com.example.BFFService.models.User;
import com.example.BFFService.models.UserResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;

@Scope("request")
@Service
public class UserService {
    private final WebClient userServiceWebClient;
    private final WebClient orderServiceWebClient;

    public UserService(@Qualifier("userServiceWebClient") WebClient userServiceWebClient,
                       @Qualifier("orderServiceWebClient") WebClient orderServiceWebClient) {
        this.userServiceWebClient = userServiceWebClient;
        this.orderServiceWebClient = orderServiceWebClient;
    }

    public UserResponse getUser(long userId) {
        Mono<User> userMono = userServiceWebClient
                .get()
                .uri("/api/users/{userId}", userId)
                .retrieve()
                .bodyToMono(User.class);


        Mono<List<Order>> ordersMono = orderServiceWebClient
                .get()
                .uri("/api/orders/by-user/{userId}", userId)
                .retrieve()
                .bodyToFlux(Order.class)
                .collectList();


        return Mono.zip(userMono, ordersMono)
                .map(tuple -> new UserResponse(tuple.getT1(), tuple.getT2()))
                .block();
    }
}
