package org.zcode.helloworld

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.doReturn
import org.mockito.junit.jupiter.MockitoExtension
import kotlin.test.assertEquals

@ExtendWith(MockitoExtension::class)
class HelloWorldControllerUniTest {

    @InjectMocks
    lateinit var helloWorldController : HelloWorldController

    @Mock
    lateinit var helloWorldService: HelloWorldService


    @Test
    fun test() {
        //Mockito.`when`(helloWorldService.greetings()).thenReturn(Greeting("Hello"))
        doReturn(Greeting(firstName = "Hello")).`when`(helloWorldService).greetings()
        val greeting : Greeting = helloWorldController.greetings()
        assertEquals("Hello", greeting.firstName)
    }
}