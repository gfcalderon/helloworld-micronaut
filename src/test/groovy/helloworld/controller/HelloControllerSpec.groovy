package helloworld.controller

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import reactor.core.publisher.Mono
import spock.lang.Specification
import helloworld.client.HelloClient


@MicronautTest
class HelloControllerSpec extends Specification {

    @Inject
    HelloClient helloClient

    void "test hello world default response"() {
        given:
            helloClient

        when:
            def response = Mono.from( helloClient.hello() ).block()

        then:
            response == "Hello World!"
    }

    void "test hello John Doe response"() {
        given:
            helloClient

        when:
            def response = Mono.from( helloClient.hello( "John Doe" ) ).block()

        then:
            response == "Hello John Doe!"
    }

}
