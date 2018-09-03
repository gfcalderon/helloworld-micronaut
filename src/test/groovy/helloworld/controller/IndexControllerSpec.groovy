package helloworld.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification
import helloworld.client.IndexClient

class IndexControllerSpec extends Specification {

    @Shared @AutoCleanup def embeddedServer = ApplicationContext.run( EmbeddedServer )

    void "test index response"() {       
        given:
            def client = embeddedServer.applicationContext.getBean( IndexClient )

        when:
            def response = client.index().blockingGet()

        then:
            response == "Micronaut based Hello World Application"
    }
    
}
