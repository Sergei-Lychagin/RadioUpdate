package ru.netology.domain;


public class HomeRadio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentRadioStation = 5;
    private boolean on;

    public HomeRadio(int minVolume, int maxVolume, int currentVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;


    }
    public HomeRadio(boolean on, int minRadioStation,
                     int maxRadioStation, int currentRadioStation) {
        this.on = on;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = currentRadioStation;

    }



    public HomeRadio() {
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setMaxRadioStation() {
        this.maxRadioStation = maxRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void nextRadioStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

}



