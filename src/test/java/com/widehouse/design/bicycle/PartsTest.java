package com.widehouse.design.bicycle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class PartsTest {
    @Test
    void parts_has_some_part() {
        // given
        Part chain = PartTestFixture.chain;
        Part tape = PartTestFixture.tape;
        // when
        Parts parts = new Parts(chain, tape);
        // then
        then(parts.getPartList())
                .contains(chain, tape);
    }

    @Test
    void given_Parts_when_spares_then_return_needSpareParts() {
        // given
        Part chain = PartTestFixture.chain;             // need spare
        Part tape = PartTestFixture.tape;               // need spare
        Part rearShock = PartTestFixture.rearShock;
        // when
        Parts parts = new Parts(chain, tape, rearShock);
        List<Part> partList = parts.spares();
        // then
        then(partList)
                .contains(chain, tape);

    }

}