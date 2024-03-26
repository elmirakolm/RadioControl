package org.example.RadioControl.services;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public Radio() {
        maxStation = 9;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            ;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            if (currentVolume == 100)
                return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            if (currentVolume == 0)
                return;
        }
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }
}
