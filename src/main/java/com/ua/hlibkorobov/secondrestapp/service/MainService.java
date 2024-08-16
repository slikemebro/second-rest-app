package com.ua.hlibkorobov.secondrestapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {

    private final WebClient webClient;



    public void getAll() {
        List<?> response = webClient.get()
                .uri("http://localhost:8080/api/v1/todo-list")
                .retrieve()
                .bodyToMono(List.class)
                .block();
        System.out.println(response);


    }
}
