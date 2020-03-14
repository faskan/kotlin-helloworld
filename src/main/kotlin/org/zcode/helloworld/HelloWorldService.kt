package org.zcode.helloworld

import org.springframework.stereotype.Component

@Component
class HelloWorldService {
    fun greetings() = Greeting(firstName = "Hello")
}