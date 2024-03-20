package org.example.RadioControl.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StationControlTest {

    @Test
    public void SetCurrentStationInRange() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(5);

        int expected = 5;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        StationControl stationControl = new StationControl();
        stationControl.setToMaxStation();

        int expected = 9;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void NextFromNine() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(9);
        stationControl.next();

        int expected = 0;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevFromZero() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(0);
        stationControl.prev();

        int expected = 9;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(1);
        stationControl.next();

        int expected = 2;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        StationControl stationControl = new StationControl();
        stationControl.setCurrentStation(9);
        stationControl.prev();

        int expected = 8;
        int actual = stationControl.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

