package com.omio.spock;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Name {
    PABLO_PICASSO("Pablo Picasso"),
    CANDIDO_PORTINARI("Candido Portinari"),
    ROMERO_BRITTO("Romero Britto"),
    UNKNOWN("Unknown");

    private final String text;

    @Override
    public String toString() {
        return text;
    }

    public static Name fromString(final String nameText) {
        return Arrays.stream(Name.values())
                     .filter(name -> name.toString().equals(nameText))
                     .findFirst()
                     .orElse(Name.UNKNOWN);
    }
}
