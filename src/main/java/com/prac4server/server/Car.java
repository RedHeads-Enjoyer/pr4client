package com.prac4server.server;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Car {
    private Integer id;
    private String model;
    private String color;
    private Float price;
}