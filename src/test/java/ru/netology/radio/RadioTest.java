package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio rd = new Radio(20);


        rd.setCurrentStation(4);

        int expected = 4;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation1() {
        Radio rd = new Radio(20);


        rd.setCurrentStation(-1);

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation2() {
        Radio rd = new Radio(20);


        rd.setCurrentStation(20);



        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rd = new Radio(20);


        rd.setCurrentVolume(4);

        int expected = 4;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio rd = new Radio(20);


        rd.setCurrentVolume(-1);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume2() {
        Radio rd = new Radio(20);


        rd.setCurrentVolume(101);

        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rd = new Radio(20);

        rd.setMaxVolume();


        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio rd = new Radio(20);

        rd.setMinVolume();


        int expected = 0;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldNextStation() {
        Radio rd = new Radio(20);

        rd.setCurrentStation(2);
        rd.nextStation();

        int expected = 3;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation0() {
        Radio rd = new Radio(20);

        rd.setCurrentStation(9);
        rd.nextStation();

        int expected = 0;
        int actual = rd.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() {
        Radio rd = new Radio(20);

        rd.setCurrentStation(2);

        int expected = 1;
        int actual = rd.prevStation();

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldPrevStation9() {
        Radio rd = new Radio(20);

        rd.setCurrentStation(0);

        int expected = 9;
        int actual = rd.prevStation();

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rd = new Radio(20);

        rd.setCurrentVolume(2);

        rd.increaseVolume();

        int expected = 3;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume100() {
        Radio rd = new Radio(20);

        rd.setCurrentVolume(100);

        rd.increaseVolume();

        int expected = 100;
        int actual = rd.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldTurnDownVolume() {
        Radio rd = new Radio(20);

        rd.setCurrentVolume(2);

        int expected = 1;
        int actual = rd.turnDownVolume();

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void shouldTurnDownVolume0() {
        Radio rd = new Radio(20);

        rd.setCurrentVolume(0);

        int expected = 0;
        int actual = rd.turnDownVolume();

        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void test() {
        Radio rd = new Radio(20);

        Assertions.assertEquals(0, rd.getMinStation());
        Assertions.assertEquals(19, rd.getMaxStation());
    }
}