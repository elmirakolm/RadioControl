package org.example.RadioControl.services;

public class StationControl {
    public int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }
}
