package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    // ===== Радиостанции =====

    @Test
    void shouldSetValidStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldIgnoreStationBelowZero() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldIgnoreStationAboveNine() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToNextStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchFromNineToZero() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchToPrevStation() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldSwitchFromZeroToNine() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    // ===== Громкость =====

    @Test
    void shouldSetValidVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void shouldIgnoreVolumeBelowZero() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIgnoreVolumeAboveMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAboveMax() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowZero() {
        ru.netology.radio.Radio radio = new ru.netology.radio.Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}