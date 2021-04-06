package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeRadioTest {

    @Test
    public void setMaxRadioStation() {
        HomeRadio radioman = new HomeRadio(true,0, 50, 5);
        radioman.setMaxRadioStation();
        assertEquals(50, radioman.getMaxRadioStation());


    }

}