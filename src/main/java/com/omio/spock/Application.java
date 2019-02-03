package com.omio.spock;

import com.omio.spock.painting.painter.PainterFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info(PainterFactory.getPainterInstance(Name.ROMERO_BRITTO).introduce());
        log.info(PainterFactory.getPainterInstance(Name.CANDIDO_PORTINARI).introduce());
        log.info(PainterFactory.getPainterInstance(Name.PABLO_PICASSO).introduce());
    }

}
