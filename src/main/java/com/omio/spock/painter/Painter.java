package com.omio.spock.painter;

public abstract class Painter {
    protected abstract String getName();

    public String introduce() {
        return String.format("I am %s!", getName());
    }
}
