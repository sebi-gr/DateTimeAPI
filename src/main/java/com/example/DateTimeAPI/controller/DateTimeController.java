package com.example.DateTimeAPI.controller;

import com.example.DateTimeAPI.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class DateTimeController {

    @Autowired
    DateTimeService dateTimeService;

    @GetMapping("/time")
    public ResponseEntity<LocalTime> getTime () {
        return new ResponseEntity<>(dateTimeService.getTime(), HttpStatus.OK);
    }

    @GetMapping("/date")
    public ResponseEntity<LocalDate> getDate () {
        return new ResponseEntity<>(dateTimeService.getDate(), HttpStatus.OK);
    }

    @GetMapping("/dateRequest")
    public ResponseEntity<String> getDateRequest (@RequestParam String format) {
        return new ResponseEntity<>(dateTimeService.getDateRequest(format), HttpStatus.OK);
    }
}
