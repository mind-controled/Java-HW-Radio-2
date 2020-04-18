package ru.netology.domain;

public class Radio {

    private String name;
    private int currentStation;
    private int currentVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentStation() {

        if (currentStation >= maxStation) {
            currentStation = minStation;
            return;
        }

        currentStation += 1;

    }

    public void decreaseCurrentStation() {

        if (currentStation <= minStation) {
            currentStation = maxStation;
            return;
        }

        currentStation -= 1;

    }

    public void increaseCurrentVolume() {

        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }

        currentVolume += 1;

    }

    public void decreaseCurrentVolume() {

        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }

        currentVolume -= 1;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    //public int getMaxStation() {
    //    return maxStation;
    //}

    //public void setMaxStation(int maxStation) {
    //    this.maxStation = maxStation;
    //}

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

}