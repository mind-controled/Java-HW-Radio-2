package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private static int maxStation = 10;
    private final static int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public Radio(int maxStation) {
        this.maxStation = maxStation;
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
}