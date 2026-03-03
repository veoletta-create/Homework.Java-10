package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsNumber = 10;
    private int maxStation;
    private boolean on;

    public Radio() {
    }

    public Radio(int stationsNumber, boolean on) {
        this.stationsNumber = stationsNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setCurrentStation(int currentStation) {
        maxStation = stationsNumber - 1;
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void goToNextStation() {
        maxStation = stationsNumber - 1;
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void goToPrevStation() {
        maxStation = stationsNumber - 1;
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setStationsNumber(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public void setMaxStation(int stationsNumber) {
        maxStation = stationsNumber - 1;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}