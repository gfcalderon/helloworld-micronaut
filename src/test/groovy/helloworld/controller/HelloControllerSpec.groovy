package helloworld.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
import helloworld.client.HelloClient

class HelloControllerSpec extends Specification {

    @Shared @AutoCleanup def embeddedServer = ApplicationContext.run( EmbeddedServer )

    void "test hello world default response"() {
        given:
            def client = embeddedServer.applicationContext.getBean( HelloClient )

        when:
            def response = client.hello().blockingGet()

        then:
            response == "Hello World!"
    }

    void "test hello John Doe response"() {
        given:
            def client = embeddedServer.applicationContext.getBean( HelloClient )

        when:
            def response = client.hello( "John Doe" ).blockingGet()

        then:
            response == "Hello John Doe!"
    }
    
}
