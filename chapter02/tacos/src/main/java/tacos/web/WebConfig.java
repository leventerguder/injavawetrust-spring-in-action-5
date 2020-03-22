package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
    /*
     The addViewControllers method is given a ViewControllerRegistry that you can use to register one or more view
     controllers.
     You call addViewController on the registry passing in "/" which is the path for which you view controller will
     handle GET requests.
     You have been able to replace HomeController
     */

}
