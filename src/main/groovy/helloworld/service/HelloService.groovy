package helloworld.service

import io.reactivex.Single

import javax.inject.Singleton

@Singleton
class HelloService {

    Single hello() {
        return hello( "World" )
    }

    Single hello( name ) {
        return Single.just( "Hello ${name}!" )
    }

}
