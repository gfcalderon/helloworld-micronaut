package helloworld.client

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single
 
@CompileStatic
@Client( "/" )
interface IndexClient {

    @Get( "/" )
    Single index()
    
}