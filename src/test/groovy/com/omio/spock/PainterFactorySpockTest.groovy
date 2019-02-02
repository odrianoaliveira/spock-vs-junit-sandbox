package com.omio.spock

import com.omio.spock.painter.PainterFactory
import spock.lang.Specification
import spock.lang.Unroll

class PainterFactorySpockTest extends Specification {

    @Unroll
    def "scenario : painter is #name"() {
        given: "a painter"
        def painter = PainterFactory.getPainterInstance(Name.fromString(name))

        when: "introduce himself"
        def result = painter.introduce()

        then: "should say his name"
        result == "I am $name!"

        where:
        name << ["Pablo Picasso", "Candido Portinari", "Romero Britto"]
    }
}// 23 lines
