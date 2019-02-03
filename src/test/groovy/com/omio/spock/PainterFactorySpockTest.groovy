package com.omio.spock

import com.omio.spock.painting.painter.PainterFactory
import spock.lang.Specification
import spock.lang.Unroll

class PainterFactorySpockTest extends Specification {

    @Unroll
    def "scenario : painter is #name"() {
        given: "a painter"
        def painter = PainterFactory.getPainterInstance(Name.fromString(name.getName()))

        when: "introduce himself"
        def result = painter.introduce()

        then: "should say his name"
        result == "I am ${name.getName()}!"

        where:
        name << [Name.PABLO_PICASSO, Name.CANDIDO_PORTINARI, Name.ROMERO_BRITTO]
    }
}
