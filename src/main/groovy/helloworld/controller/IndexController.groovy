package helloworld.controller

import groovy.transform.CompileStatic
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType
import org.reactivestreams.Publisher
import reactor.core.publisher.Mono

@CompileStatic
@Controller( "/" )
class IndexController {

    @Get( "/" )
    @Produces( MediaType.TEXT_PLAIN )
    @SingleResult
    Publisher index() {
        return Mono.just("Micronaut based Hello World Application" )
    }

}