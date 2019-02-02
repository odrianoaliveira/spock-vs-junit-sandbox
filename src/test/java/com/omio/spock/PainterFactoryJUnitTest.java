package com.omio.spock;

import com.omio.spock.painter.Painter;
import com.omio.spock.painter.PainterFactory;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@RequiredArgsConstructor
public class PainterFactoryJUnitTest {

    @Parameterized.Parameters(name = "painter is {0}")
    public static Iterable<String> data() {
        return Arrays.asList("Pablo Picasso", "Candido Portinari", "Romero Britto");
    }

    private final String name;

    @Test
    public void whenAPainterIntroducesHimselfThenShouldSayHisName() {
        //given
        Painter painter = PainterFactory.getPainterInstance(Name.fromString(name));
        //when
        String result = painter.introduce();
        //then
        assertEquals("should say his name", String.format("I am %s!", name), result);
    }
}// 34 lines - using lombok
