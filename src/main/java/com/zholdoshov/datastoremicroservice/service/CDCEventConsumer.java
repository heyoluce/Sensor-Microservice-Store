package com.zholdoshov.datastoremicroservice.service;

public interface CDCEventConsumer
{
    void handle(String message);
}
