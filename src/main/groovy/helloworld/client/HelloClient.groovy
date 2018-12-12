package helloworld.client

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

@CompileStatic
@Client( "/hello" )
interface HelloClient {

    @Get( "/" )
    Single hello()
    
    @Get( "/{name}" )
    Single hello( name )

}