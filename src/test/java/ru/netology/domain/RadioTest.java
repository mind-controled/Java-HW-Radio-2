package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    Radio radio = new Radio(10);

    @Test
    void increaseCurrentStation() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
        System.out.println("Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void decreaseCurrentVolumeWell() {
        radio.setCurrentVolume(90);
        radio.decreaseCurrentVolume();
        assertEquals(89, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }


    @Test
    void decreaseCurrentStation() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
        System.out.println("Station:" + radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationWell() {

        radio.setCurrentStation(5);
        radio.decreaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
        System.out.println("Station:" + radio.getCurrentStation());
    }


    @Test
    void increaseCurrentStationWell() {
        radio.setCurrentStation(5);
        radio.increaseCurrentStation();
        assertEquals(6, radio.getCurrentStation());
        System.out.println("Station:" + radio.getCurrentStation());
    }


    @Test
    void increaseCurrentVolume() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }

    @Test
    void increaseCurrentVolumeWell() {
        radio.setCurrentVolume(89);
        radio.increaseCurrentVolume();
        assertEquals(90, radio.getCurrentVolume());
        System.out.println("Volume:" + radio.getCurrentVolume());
    }
}