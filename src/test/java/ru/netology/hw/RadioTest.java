package ru.netology.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void setStationNumber_More9() {
        Radio radio = new Radio();
        radio.setStationNumber(20);

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setStationNumber_Less0() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextStationNumber_Between0and9() {
        Radio radio = new Radio();
        radio.setStationNumber(8); // stationNumber

        radio.nextStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationNumber_Is9() {
        Radio radio = new Radio();
        radio.setStationNumber(9); // stationNumber

        radio.nextStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrevStationNumber_Between9and1() {
        Radio radio = new Radio();
        radio.setStationNumber(9); // stationNumber

        radio.prevStationNumber();

        int expected = 8;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrevStationNumber_LessAndEquals0() {
        Radio radio = new Radio();
        radio.setStationNumber(0); // stationNumber

        radio.prevStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolume_More10() {
        Radio radio = new Radio();
        radio.setVolume(50);

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume_Less0() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeUntilMax_MoreAndEquals10() {
        Radio radio = new Radio();
        radio.setVolume(11);

        radio.nextUntilMax();

        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextVolumeUntilMax_Less10() {
        Radio radio = new Radio();
        radio.setVolume(8);

        radio.nextUntilMax();

        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolumeUntilMin_Between0and10() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.prevUntilMin();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolumeUntilMin_Equals0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.prevUntilMin();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}