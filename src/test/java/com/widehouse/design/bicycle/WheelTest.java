package com.widehouse.design.bicycle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class WheelTest {
    private static final Wheel wheel = new Wheel(26, 2);

    @Test
    void diameterTest() {
        // when
        double diameter = wheel.diameter();
        // then
        then(diameter).isEqualTo(26 + 2 * 2);
    }

    @Test
    void circumferenceTest() {
        // when
        double cir = wheel.getCircumference();
        // then
        then(cir).isEqualTo((26 + 4) * Math.PI);
    }
}
