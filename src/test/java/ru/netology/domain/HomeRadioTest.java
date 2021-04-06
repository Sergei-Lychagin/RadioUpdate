package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeRadioTest {

    @Test
    public void increaseVolume() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(7);
        radioman.increaseVolume();
        int expected = 8;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(7);
        radioman.decreaseVolume();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMin() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMax() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(5);
        radioman.nextRadioStation();
        int expected = 6;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(5);
        radioman.prevRadioStation();
        int expected = 4;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {

        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentStationOver() {
        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(13);
        int expected = 9;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationUnder() {
        HomeRadio radioman = new HomeRadio();
        radioman.setMaxRadioStation(9);
        radioman.setMinRadioStation(0);
        radioman.setCurrentRadioStation(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentVolumeOver() {
        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(11);
        int expected = 10;

        assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {
        HomeRadio radioman = new HomeRadio();
        radioman.setMaxVolume(10);
        radioman.setMinVolume(0);
        radioman.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, radioman.getCurrentVolume());
    }

}