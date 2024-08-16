package com.ua.hlibkorobov.secondrestapp.service;

import com.ua.hlibkorobov.secondrestapp.dto.TodoItem;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.LinkedHashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {

    private final WebClient webClient;


    public List<TodoItem> getAll() {
        return webClient.get()
                .uri("http://localhost:8080/api/v1/todo-list")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<TodoItem>>() {})
                .block();
    }
}
