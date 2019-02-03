package com.omio.spock.painting;

import com.omio.spock.painting.painter.Painter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Painting {
    private String title;
    private Painter painter;

    public String description() {
        return String.format("I've been painted by '%s' and my title is '%s'", painter.getName(), title);
    }
}
