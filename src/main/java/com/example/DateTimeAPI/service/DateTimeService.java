package com.example.DateTimeAPI.service;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class DateTimeService {

    public LocalTime getTime () {
        return LocalTime.now();
    }
}
