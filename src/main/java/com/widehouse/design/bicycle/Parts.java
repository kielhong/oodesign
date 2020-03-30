package com.widehouse.design.bicycle;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Parts {
    private List<Part> partList;

    public Parts(Part ... part) {
        partList = Arrays.asList(part);
    }

    public List<Part> spares() {
        return partList.stream()
                .filter(Part::isNeedSpare)
                .collect(Collectors.toList());
    }
}
