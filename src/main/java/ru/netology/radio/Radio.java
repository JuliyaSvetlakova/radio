package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int currentVolume;
    private int maxVolume = 100;


    public Radio() {
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public void setCurrentRadioStation(int newcurrentRadioStation) {
        if (newcurrentRadioStation < 0) {
            return;
        }
        if (newcurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newcurrentRadioStation;
    }
    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }
    public void setToMinRadioStation() {
        currentRadioStation = 0;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = maxRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }
    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }
}