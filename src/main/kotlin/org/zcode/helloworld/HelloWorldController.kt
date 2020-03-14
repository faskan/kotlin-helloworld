package org.zcode.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(val helloWorldService : HelloWorldService) {

    @GetMapping("/greetings")
    fun greetings() = helloWorldService.greetings()
}