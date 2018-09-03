package helloworld.controller

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import io.reactivex.Single

@CompileStatic
@Controller("/")
class IndexController {

    @Get("/")
    @Produces( MediaType.TEXT_PLAIN )
    Single index() {
        return Single.just( "Micronaut based Hello World Application" )
    }    

}