package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // Spring Boot Application
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args); // Runs the Application
    }

    /*
    @SpringBootConfiguration is a composite application that combines three other annotations

    #### @SpringBootConfiguration ####
    Designates this class as a configuration class.
    This annotation is , in fact, a specialized form of the @Configuration annotation.

    #### @EnableAutoConfiguration ####
    Enables Spring Boot automatic configuration.
    This annotation tells Spring Boot to automatically configure any components that it thinks you will need.

    #### @ComponentScan ####
    Enables component scanning. This lets you declare other classes with annotations like
    @Componet @Controller @Service and others to have Spring automatically discover them and
    register them as components in the Spring application context.

     */

    /*
    DevTools provides Spring developers with some handy development time tools
    - Automatic application restart when code changes
    - Automatic browser refresh when browser-destined resource change
    - Automatic disable of template caches
    - Built in H2 console if the H2 database is in use.
     */


    /*

    - Spring aims to make developer challenges easy,
    like creating web applications, working with databases, securing applications, and microservices.

    - Spring Boot builds on top of Spring to make Spring even easier with simplified dependency management,
    automatic configuration, and runtime insights.

    - Spring applications can be initialized using the Spring Initializr, which is web based and supported
    natively in most Java development environments

    - The components, commonly referred to as beans, in a Spring application context can be declared explicitly
    with Java or XML, discovered by component scanning, or automatically configured with Spring Boot auto configuration

     */
}
