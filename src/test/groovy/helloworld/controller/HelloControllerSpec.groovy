package helloworld.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
import helloworld.client.HelloClient

class HelloControllerSpec extends Specification {

    @Shared @AutoCleanup def embeddedServer = ApplicationContext.run( EmbeddedServer )

    void "test hello world response"() {
        given:
            def client = embeddedServer.applicationContext.getBean( HelloClient )
        
        when:
            def response = client.hello().blockingGet()

        then:
            response == "Hello World!"
    }
    
}
