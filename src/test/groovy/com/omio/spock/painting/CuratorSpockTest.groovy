package com.omio.spock.painting

import spock.lang.Specification

class CuratorSpockTest extends Specification {
    private def mockedPainting = Mock(Painting)
    private def curator = new Curator(mockedPainting)

    def "scenario: the curator presents his collection"() {
        given: "a expected result"
        def expectedDescription = "this painting is mocked"

        when: "a curator describes his painting"
        def result = curator.describeMyPainting()

        then: "the result should contains the expected description"
        result.contains(expectedDescription)

        and: "the description method should be invoked once"
        1 * mockedPainting.description() >> expectedDescription
    }
}

//http://spockframework.org/spock/docs/1.3-RC1/all_in_one.html#_fields
//http://spockframework.org/spock/docs/1.3-RC1/all_in_one.html#_combining_mocking_and_stubbing
