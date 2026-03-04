package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int sizeStation = 10;
    private int minStation = 0;
    private int maxStation = sizeStation - 1;


    public Radio() {
        this.sizeStation = sizeStation;


    }


    public Radio(int sizeStation) {
        this.maxStation = sizeStation - 1;
    }



    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation >= minStation && newCurrentStation <= maxStation) {
            return;
        } else {

            currentStation = 0;
        }
    }


    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            return;
        } else {
            currentVolume = 0;
        }
    }

    public int nextStation() {
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int prevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }


    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        return currentVolume;
    }


}