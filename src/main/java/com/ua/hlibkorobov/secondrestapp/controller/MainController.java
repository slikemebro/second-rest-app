package com.ua.hlibkorobov.secondrestapp.controller;

import com.ua.hlibkorobov.secondrestapp.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping
    public void getAll(){
        mainService.getAll();
    }
}
