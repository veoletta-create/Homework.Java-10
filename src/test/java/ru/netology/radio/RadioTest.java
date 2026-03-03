package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void stationShouldNotBeOverMax() {
        Radio radio = new Radio(50, true);
        radio.setCurrentStation(50);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void stationShouldNotBeUnder0() {
        Radio radio = new Radio(50, true);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeOver100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.goToNextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoForwardTo0AfterMax() {
        Radio radio = new Radio(50, true);
        radio.setCurrentStation(49);
        radio.goToNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.goToPrevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackToMaxAfter0() {
        Radio radio = new Radio(50, true);
        radio.goToPrevStation();
        int expected = 49;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void  shouldSetStationsNumber() {
        Radio radio = new Radio();
        radio.setStationsNumber(50);
        int expected = 50;
        int actual = radio.getStationsNumber();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(15);
        int expected = 14;
        int actual = radio.getMaxStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTurnOn() {
        Radio radio = new Radio();
        radio.setOn(true);
        Assertions.assertTrue(radio.isOn());
    }
}