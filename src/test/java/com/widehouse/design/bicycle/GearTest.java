package com.widehouse.design.bicycle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class GearTest {
    private static final Wheel wheel = new Wheel(26, 2);
    private static final Gear gear = new Gear(52, 11, wheel);

    @Test
    @DisplayName("chainring 과 cog에 따라 기어비를 반환한다")
    void ratioTest() {
        // when
        double ratio = gear.getRatio();
        // then
        then(ratio).isEqualTo(52.0/11.0);
    }

    @Test
    @DisplayName("바퀴테 지름(rim)과 타이어 높으 2배를 더해 기어 인치 값을 반환한다")
    void gearInchesTest() {
        // when
        double gearInches = gear.getGearInches();
        // then
        then(gearInches).isEqualTo((52.0/11.0) * (26 + 4));
    }
}
