package com.widehouse.design.bicycle;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.ObjectUtils;

import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

@Getter
public class Gear {
    double chainring;
    double cog;
    Wheel wheel;

    @Builder
    public Gear(Double chainring, Double cog, Wheel wheel) {
        this.chainring = defaultIfNull(chainring, 40.0);
        this.cog = defaultIfNull(cog, 18.0);
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
