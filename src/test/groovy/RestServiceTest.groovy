import spock.lang.Specification
import spock.lang.Unroll

class RestServiceTest extends Specification {
    def request = ""

    def service = new RestService()

    @Unroll
    def "Test for proper REST service response"() {
        given:
        def service = new RestService()

        when:
        def result = service.post(request)

        then:
        result.code == 200
    }


    @Unroll
    def "Test multiple requests"() {
        expect:
        service.post(request).code == 200

        where:
        request << ["Request 1", "Request 2", "Request 3"]
    }


}

class RestService {
    def post(String request) {
        def response = new RestServiceResponse()
        response.code = 200
        return response;
    }
}

class RestServiceResponse {
    int code;
}
