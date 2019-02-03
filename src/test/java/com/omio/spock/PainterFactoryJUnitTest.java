package com.omio.spock;

import com.omio.spock.painting.painter.Painter;
import com.omio.spock.painting.painter.PainterFactory;
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
    public static Iterable<Name> data() {
        return Arrays.asList(Name.PABLO_PICASSO, Name.CANDIDO_PORTINARI, Name.ROMERO_BRITTO);
    }

    private final Name name;

    @Test
    public void whenAPainterIntroducesHimselfThenShouldSayHisName() {
        //given
        Painter painter = PainterFactory.getPainterInstance(Name.fromString(name.getName()));
        //when
        String result = painter.introduce();
        //then
        assertEquals("should say his name", String.format("I am %s!", name.getName()), result);
    }
}// 34 lines - using lombok
