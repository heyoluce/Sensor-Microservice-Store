package com.zholdoshov.datastoremicroservice.web.controller;

import com.zholdoshov.datastoremicroservice.exception.SensorNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(SensorNotFoundException.class)
    public String sensorNotFoundExceptionHandler(SensorNotFoundException ex) {
        ex.printStackTrace();
        return "Sensor not found";
    }

    @ExceptionHandler
    public String server(Exception ex) {
        ex.printStackTrace();
        return "Something went wrong";
    }
}
