package com.omio.spock.painting.painter;

public abstract class Painter {
    public abstract String getName();

    public String introduce() {
        return String.format("I am %s!", getName());
    }
}
