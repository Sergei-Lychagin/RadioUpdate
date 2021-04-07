package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeRadioTest {

    @Test
    public void setMaxRadioStation() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 5);
        radioman.setMaxRadioStation();
        assertEquals(50, radioman.getMaxRadioStation());

    }

    @Test
    public void nextRadioStation() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 5);
        radioman.nextRadioStation();
        assertEquals(6, radioman.getCurrentRadioStation());

    }

    @Test
    public void prevRadioStation() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 5);
        radioman.prevRadioStation();
        assertEquals(4, radioman.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMax() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 0);
        radioman.prevRadioStation();
        assertEquals(50, radioman.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMin() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 50);
        radioman.nextRadioStation();
        assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentStation() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 43);
        radioman.setCurrentRadioStation();
        assertEquals(43, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationOver() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, 55);
        radioman.setCurrentRadioStation();
        assertEquals(50, radioman.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationUnder() {

        HomeRadio radioman = new HomeRadio(true, 0, 50, -1);
        radioman.setCurrentRadioStation();
        assertEquals(0, radioman.getCurrentRadioStation());
    }

    // Test Volume
    @Test
    void setCurrentVolume() {

        HomeRadio radioman = new HomeRadio(0, 100, 67);
        radioman.setCurrentVolume();
        assertEquals(67, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeOver() {

        HomeRadio radioman = new HomeRadio(0, 100, 111);
        radioman.setCurrentVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {

        HomeRadio radioman = new HomeRadio(0, 100, -1);
        radioman.setCurrentVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolume() {

        HomeRadio radioman = new HomeRadio(0, 100, 50);
        radioman.increaseVolume();
        assertEquals(51, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {

        HomeRadio radioman = new HomeRadio(0, 100, 50);
        radioman.decreaseVolume();
        assertEquals(49, radioman.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMin() {

        HomeRadio radioman = new HomeRadio(0, 100, 100);
        radioman.increaseVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMax() {

        HomeRadio radioman = new HomeRadio(0, 100, 0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }
}