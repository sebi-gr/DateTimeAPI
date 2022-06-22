package com.example.DateTimeAPI.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService {

    public LocalTime getTime () {
        return LocalTime.now();
    }

    public LocalDate getDate () {
        return LocalDate.now();
    }

    public String getDateRequest (String request) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(request);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}
