package ru.netology.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {


    // ДЗ 11

    @Test
    public void setCurrentStationQuantity() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getStationQuantity());
    }

    @Test
    public void setCurrentStationQuantityParam() {
        Radio radio = new Radio(14);

        Assertions.assertEquals(14, radio.getStationQuantity());
    }

    @Test
    public void setMaxStationNumber() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(19, radio.getMaxStationNumber());
    }


    @Test
    public void setStationNumberNewMax() {
        Radio radio = new Radio(10);
        radio.setStationNumberNew(9);

        Assertions.assertEquals(9, radio.getStationNumber());

    }

    @Test
    public void setStationNumberNewMin() {
        Radio radio = new Radio(1);
        radio.setStationNumberNew(1);

        Assertions.assertEquals(0, radio.getStationNumber());

    }

    @Test
    public void setStationNumberNewNumberMoreThenQuantity() {
        Radio radio = new Radio(5);
        radio.setStationNumberNew(7);

        Assertions.assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void setStationNumberNewNumberLessThen0Param() {
        Radio radio = new Radio(5);
        radio.setStationNumberNew(-1);

        Assertions.assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void setStationNumberNewNumberBetweenEnds() {
        Radio radio = new Radio(10);
        radio.setStationNumberNew(5);

        Assertions.assertEquals(5, radio.getStationNumber());
    }

    @Test
    public void setStationNumberNewNumber0() {
        Radio radio = new Radio(10);
        radio.setStationNumberNew(0);

        Assertions.assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void setStationNumber_Less0() {
        Radio radio = new Radio();
        radio.setStationNumberNew(-1);

        Assertions.assertEquals(0, radio.getStationNumber());

    }

//===================================================================================================
    //NEXT BUTTON

    @Test
    public void setNextStationNumber_BetweenEnds() {
        Radio radio = new Radio();
        radio.setStationNumberNew(5); // stationNumber

        radio.nextStationNumber();

        Assertions.assertEquals(6, radio.getStationNumber());
    }

    @Test
    public void setNextStationNumber_MaxParam() {
        Radio radio = new Radio(20);
        radio.setStationNumberNew(19); // stationNumber

        radio.nextStationNumber();

        Assertions.assertEquals(0, radio.getStationNumber());
    }

    @Test
    public void setNextStationNumber_MinParam() {
        Radio radio = new Radio(2);
        radio.setStationNumberNew(0); // stationNumber

        radio.nextStationNumber();

        Assertions.assertEquals(1, radio.getStationNumber());
    }


//   #1 - невозможно протестировать?
//    --------------------------------
//    @Test
//    public void setNextStationNumber_MoreThanMax() {
//        Radio radio = new Radio();
//        radio.setStationNumberNew(15); // stationNumber
//
//        radio.nextStationNumber();
//
//        Assertions.assertEquals(0, radio.getStationNumber());
//    }


//   #2 - невозможно протестировать?
//    --------------------------------
//    @Test
//    public void setNextStationNumber_Equal0() {
//        Radio radio = new Radio(10);
//        radio.setStationNumberNew(10); // stationNumber
//
//        radio.nextStationNumber();
//
//        Assertions.assertEquals(0, radio.getStationNumber());
//    }

    //===================================================================================================

    //PREV BUTTON

    @Test
    public void setPrevStationNumber_Max() {
        Radio radio = new Radio(8);
        radio.setStationNumberNew(7); // stationNumber

        radio.prevStationNumber();

        Assertions.assertEquals(6, radio.getStationNumber());

    }

    @Test
    public void setPrevStationNumber_BetweenEnds() {
        Radio radio = new Radio();
        radio.setStationNumberNew(6); // stationNumber

        radio.prevStationNumber();

        Assertions.assertEquals(5, radio.getStationNumber());

    }

    @Test
    public void setPrevStationNumber_Equals0() {
        Radio radio = new Radio(25);
        radio.setStationNumberNew(0); // stationNumber

        radio.prevStationNumber();

        int expected = 24;
        int actual = radio.getStationNumber(); // stationNumber
        Assertions.assertEquals(expected, actual);

    }

    //==============================================================================================

    // VOLUME

    @Test
    public void setVolume_More100() {
        Radio radio = new Radio();
        radio.setVolume(150);

        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void setVolume_Less0() {
        Radio radio = new Radio();
        radio.setVolume(-10);

        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void setVolume_BetweenEnds() {
        Radio radio = new Radio();
        radio.setVolume(55);

        Assertions.assertEquals(55, radio.getVolume());
    }


    @Test
    public void nextVolumeUntilMax_Equals100() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.nextUntilMax();

        Assertions.assertEquals(100, radio.getVolume());

    }

    @Test
    public void nextVolumeUntilMax_BetweenEnds() {
        Radio radio = new Radio();
        radio.setVolume(25);

        radio.nextUntilMax();

        Assertions.assertEquals(26, radio.getVolume());

    }

    @Test
    public void nextVolumeUntilMax_Equal0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.nextUntilMax();

        Assertions.assertEquals(1, radio.getVolume());

    }


    @Test
    public void prevVolumeUntilMin_Equal0() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.prevUntilMin();

        Assertions.assertEquals(0, radio.getVolume());

    }

    @Test
    public void prevVolumeUntilMin_BetweenEnds() {
        Radio radio = new Radio();
        radio.setVolume(67);

        radio.prevUntilMin();

        Assertions.assertEquals(66, radio.getVolume());
    }
}