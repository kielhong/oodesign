package com.widehouse.design.bicycle;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Gear {
    double chainring;
    double cog;
    Wheel wheel;

    @Builder
    public Gear(Double chainring, Double cog, Wheel wheel) {
        this.chainring = chainring == null ? 40 : chainring;
        this.cog = cog == null ? 18 : cog;
        this.wheel = wheel;
    }

    public double getRatio() {
        return getChainring() / getCog();
    }

    public double getGearInches() {
        return getRatio() * getDiameter();
    }

    private double getDiameter() {
        return wheel.getDiameter();
    }
}
