package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args);
  }

  /*
  Caching Templates
  By default, templates are only parsed once, when they’re first used, and the results of that parse are cached
  for subsequent use. This is a great feature for production, as it prevents redundant template parsing
  on each request and thus improves performance.

  By default, all of these properties are set to true to enable caching

  spring.freemarker.cache
  spring.groovy.template.cache
  spring.mustache.cache
  spring.thymeleaf.cache

  DevTools will disable caching for all template libraries.
   */
}
