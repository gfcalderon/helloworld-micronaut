package helloworld.client

import groovy.transform.CompileStatic
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@CompileStatic
@Client( "/hello" )
interface HelloClient {

    @Get( "/" )
    @Consumes(MediaType.TEXT_PLAIN )
    Single hello()

    @Get( "/{name}" )
    @Consumes(MediaType.TEXT_PLAIN )
    Single hello( name )

}