package com.omio.spock.painting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CuratorMockitoTest {

    @Mock
    private Painting painting;

    private Curator curator;

    @Before
    public void setup() {
        curator = new Curator(painting);
    }

    @Test
    public void curatorShouldPresentHisPainting() {
        final String expectedDescription = "this painting is mocked";
        when(painting.description()).thenReturn(expectedDescription);

        //when
        String result = curator.describeMyPainting();

        //then
        verify(painting).description();

        //and
        assertThat(result, containsString(expectedDescription));
    }
}
