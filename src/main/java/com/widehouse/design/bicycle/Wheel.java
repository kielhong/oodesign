package com.widehouse.design.bicycle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Wheel implements Diameterizable {
    private double rim;
    private double tire;

    public double getCircumference() {
        return diameter() * Math.PI;
    }

    @Override
    public double diameter() {
        return getRim() + getTire() * 2;
    }
}
