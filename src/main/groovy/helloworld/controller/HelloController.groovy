package helloworld.controller

import groovy.transform.CompileStatic
import helloworld.service.HelloService
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import org.reactivestreams.Publisher

@CompileStatic
@Controller( "/hello" )
class HelloController {

    private final HelloService helloService

    HelloController( HelloService helloService ) {
        this.helloService = helloService
    }

    @Get( "/" )
    @Produces( MediaType.TEXT_PLAIN )
    @SingleResult
    Publisher hello() {
        return helloService.hello()
    }

    @Get( "/{name}" )
    @Produces( MediaType.TEXT_PLAIN )
    @SingleResult
    Publisher hello( name ) {
        return helloService.hello( name )
    }

}