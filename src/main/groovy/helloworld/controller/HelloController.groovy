package helloworld.controller

import groovy.transform.CompileStatic
import helloworld.service.HelloService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import io.reactivex.Single

@CompileStatic
@Controller( "/hello" )
class HelloController {

    private final HelloService helloService

    HelloController( HelloService helloService ) {
        this.helloService = helloService
    }

    @Get( "/" )
    @Produces( MediaType.TEXT_PLAIN )
    Single hello() {
        return helloService.hello()
    }

    @Get( "/{name}" )
    @Produces( MediaType.TEXT_PLAIN )
    Single hello( name ) {
        return helloService.hello( name )
    }    
  
}