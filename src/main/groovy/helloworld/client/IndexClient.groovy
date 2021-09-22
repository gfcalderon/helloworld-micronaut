package helloworld.client

import groovy.transform.CompileStatic
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import org.reactivestreams.Publisher

@CompileStatic
@Client( "/" )
interface IndexClient {

    @Get( "/" )
    @Consumes(MediaType.TEXT_PLAIN )
    @SingleResult
    Publisher index()

}