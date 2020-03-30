package com.widehouse.design.bicycle;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Part {
    private String name;
    private String description;
    private boolean needSpare;

    public Part(String name, String description) {
        this(name, description, true);
    }
}
