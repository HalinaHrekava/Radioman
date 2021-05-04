package ru.netology.domain;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 5;


    public void increaseCurrentStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
            return;
        }
        setCurrentStation(currentStation + 1);
    }

    public void decreaseCurrentStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
            return;
        } else {
            setCurrentStation(currentStation - 1);
        }

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        setCurrentVolume(currentVolume - 1);

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


}






