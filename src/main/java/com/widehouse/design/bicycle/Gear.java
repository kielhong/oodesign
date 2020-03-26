package com.widehouse.design.bicycle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Gear {
    int chainring;
    int cog;
    int rim;
    float tire;

    public double getRatio() {
        return (double) getChainring() / (double) getCog();
    }

    public double getGearInches() {
        return getRatio() * (getRim() + getTire() * 2);
    }
}
