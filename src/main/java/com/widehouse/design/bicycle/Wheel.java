package com.widehouse.design.bicycle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Wheel {
    private double rim;
    private double tire;

    public double getCircumference() {
        return getDiameter() * Math.PI;
    }

    public double getDiameter() {
        return getRim() + getTire() * 2;
    }
}
