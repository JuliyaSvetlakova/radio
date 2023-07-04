package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouleSetToQuantityRadioStation() {
        Radio station = new Radio(30);
        Assertions.assertEquals(29, station.getMaxRadioStation());
    }

    @Test
    public void shouleSetToQuantityRadioStationZero() {
        Radio station = new Radio(0);
        Assertions.assertEquals(-1, station.getMaxRadioStation());
    }

    @Test
    public void radioStationNumberWithinTheBoundaryValues() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(3);
        int expected = 3;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNumberOutsideTheMinimumValue() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNumberOutsideTheMaximumValue() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(30);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToTheNextRadioStation() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(10);
        station.nextRadioStation();
        int expected = 11;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToTheNextRadioStationZero() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(29);
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToThePrevtRadioStation() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(12);
        station.prevRadioStation();
        int expected = 11;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingToThePrevtRadioStationMax() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(0);
        station.prevRadioStation();
        int expected = 29;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetToMaxRadioStation() {
        Radio station = new Radio();
        station.setMaxRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetToMinRadioStation() {
        Radio station = new Radio();
        station.setMinRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueRadioStationLessMin() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueRadioStationMoreMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.nextRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNextRadioStationZero() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulePrevtRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.prevRadioStation();
        int expected = 4;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulePrevtRadioStationNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.prevRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouleSetToMaxVolume() {
        Radio volume = new Radio();
        volume.setMaxVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetToMinVolume() {
        Radio volume = new Radio();
        volume.setMinVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueVolumeLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValueVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNoIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleReduceVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleNoReduceVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
