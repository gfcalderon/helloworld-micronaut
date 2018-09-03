package helloworld.controller

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import io.reactivex.Single

@CompileStatic
@Controller( "/hello" )
class HelloController {

    @Get( "/" )
    @Produces( MediaType.TEXT_PLAIN )
    Single hello() {
        return hello( "World" )
    }

    @Get( "/{name}" )
    @Produces( MediaType.TEXT_PLAIN )
    Single hello( name ) {
        return Single.just( "Hello ${name}!" )
    }    
  
}