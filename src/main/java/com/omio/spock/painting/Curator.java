package com.omio.spock.painting;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Curator {
    private final Painting painting;

    public String describeMyPainting() {
        final String description = painting.description();
        return String.format("My painting is: %s", description);
    }

}
