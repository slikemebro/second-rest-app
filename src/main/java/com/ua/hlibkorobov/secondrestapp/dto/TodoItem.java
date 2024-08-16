package com.ua.hlibkorobov.secondrestapp.dto;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class TodoItem {

    private long id;

    private String title;

    private String description;

    private String status;

    private LocalDate createdDate;
}
