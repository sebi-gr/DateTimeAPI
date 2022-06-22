package com.example.DateTimeAPI;

import com.example.DateTimeAPI.controller.DateTimeController;
import com.example.DateTimeAPI.service.DateTimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DateTimeTest {

    @Autowired
    DateTimeController dateTimeController;

    @Autowired
    DateTimeService dateTimeService;

    @Test
    public void testGetTime () {
        assertThat(dateTimeService.getTime()).isBeforeOrEqualTo(LocalTime.now());
    }

    @Test
    public void testGetDate () {
        assertThat(dateTimeService.getDate()).isBeforeOrEqualTo(LocalDate.now());
    }

    @Test
    public void testGetDateRequest () {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        assertThat(dateTimeService.getDateRequest("yyyy-MM-dd")).isEqualTo(dtf.format(now));
    }
}
