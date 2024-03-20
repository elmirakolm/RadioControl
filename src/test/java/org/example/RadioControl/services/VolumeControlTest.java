package org.example.RadioControl.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeControlTest {

    @Test
    public void shouldSetVolume() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.currentVolume = 50;

        int expected = 50;
        int actual = volumeControl.currentVolume;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetToMaxVolume() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setToMaxVolume();
        int expected = 100;
        int actual = volumeControl.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeFromMaximum() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(100);
        volumeControl.increaseVolume();

        int expected = 100;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeFromNinetyNine() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(99);
        volumeControl.increaseVolume();

        int expected = 100;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void DecreaseVolumeFromOne() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(1);
        volumeControl.decreaseVolume();

        int expected = 0;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeFromZero() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(0);
        volumeControl.decreaseVolume();

        int expected = 0;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeFromTwo() {
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.setCurrentVolume(2);
        volumeControl.decreaseVolume();

        int expected = 1;
        int actual = volumeControl.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}