package org.magnum.mobilecloud.video

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

// Tell Spring that this object represents a Configuration for the
// application
@Configuration
// Tell Spring to turn on WebMVC (e.g., it should enable the DispatcherServlet
// so that requests can be routed to our Controllers)
@EnableWebMvc
// Tell Spring to go and scan our controller package (and all sub packages) to
// find any Controllers or other components that are part of our application.
// Any class in this package that is annotated with @Controller is going to be
// automatically discovered and connected to the DispatcherServlet.
@ComponentScan
// Tell Spring to automatically inject any dependencies that are marked in
// our classes with @Autowired
@EnableAutoConfiguration
open class Application {
    // Tell Spring to launch our app!
    companion object {

    @JvmStatic fun main(args: Array<String>) {
        SpringApplication.run(Application::class.java, *args)
    }
    }
}

/*
@EnableAutoConfiguration
object Application {
    // Tell Spring to launch our app!
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(Application::class.java, *args)
    }
}
*/