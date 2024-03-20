
package org.example.RadioControl.services;

public class VolumeControl {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
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
}
