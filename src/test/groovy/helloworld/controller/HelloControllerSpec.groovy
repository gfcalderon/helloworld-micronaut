package helloworld.controller

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import spock.lang.Specification
import helloworld.client.HelloClient

import javax.inject.Inject

@MicronautTest
class HelloControllerSpec extends Specification {

    @Inject
    HelloClient helloClient

    void "test hello world default response"() {
        given:
            helloClient

        when:
            def response = helloClient.hello().blockingGet()

        then:
            response == "Hello World!"
    }

    void "test hello John Doe response"() {
        given:
            helloClient

        when:
            def response = helloClient.hello( "John Doe" ).blockingGet()

        then:
            response == "Hello John Doe!"
    }

}
