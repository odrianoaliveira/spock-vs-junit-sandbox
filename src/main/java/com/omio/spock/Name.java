package com.omio.spock;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum Name {
    PABLO_PICASSO("Pablo Picasso"),
    CANDIDO_PORTINARI("Candido Portinari"),
    ROMERO_BRITTO("Romero Britto"),
    UNKNOWN("Unknown");

    @Getter
    private final String name;

    public static Name fromString(final String nameText) {
        return Arrays.stream(Name.values())
                     .filter(n -> n.getName().equals(nameText))
                     .findFirst()
                     .orElse(Name.UNKNOWN);
    }
}
