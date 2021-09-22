package helloworld.service

import jakarta.inject.Singleton
import org.reactivestreams.Publisher
import reactor.core.publisher.Mono

@Singleton
class HelloService {

    static Publisher hello() {
        return hello( "World" )
    }

    static Publisher hello(name ) {
        return Mono.just("Hello ${name}!" )
    }

}
