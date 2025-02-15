package ru.netology;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentRadioStation != maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void volumeUp() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void volumeDown() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}



