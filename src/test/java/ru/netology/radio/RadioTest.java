package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouleSetToMaxRadioStation() {
        Radio station = new Radio();
        station.setToMaxRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetToMinRadioStation() {
        Radio station = new Radio();
        station.setToMinRadioStation();
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
        volume.setToMaxVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
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
