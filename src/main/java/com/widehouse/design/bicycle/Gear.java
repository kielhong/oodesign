package com.widehouse.design.bicycle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Gear {
    double chainring;
    double cog;
    Wheel wheel;

    public double getRatio() {
        return getChainring() / getCog();
    }

    public double getGearInches() {
        return getRatio() * wheel.getDiameter();
    }
}
