package com.widehouse.design.bicycle;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class PartTest {
    @Test
    void initTest() {
        Part part = new Part("name", "desc", true);
        // then
        then(part)
                .hasFieldOrPropertyWithValue("name", "name")
                .hasFieldOrPropertyWithValue("description", "desc")
                .hasFieldOrPropertyWithValue("needSpare", true);
    }

    @Test
    void init_without_needSpare_then_default_true() {
        Part part = new Part("name", "desc");
        // then
        then(part)
                .hasFieldOrPropertyWithValue("name", "name")
                .hasFieldOrPropertyWithValue("description", "desc")
                .hasFieldOrPropertyWithValue("needSpare", true);
    }
}