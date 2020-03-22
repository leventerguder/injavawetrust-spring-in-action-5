package tacos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)    // Uses the Spring runner
/*
@RunWith is a JUnit annotation , providing a test runner that guides JUnit in running a test.
 */
/*
class SpringRunner extends SpringJUnit4ClassRunner
 */
@SpringBootTest                 // A Spring Boot test
/*
@SpringBootTest tells JUnit to bootstrap the test with Spring Boot capabilities.
 */

/*
@RunWith(SpringRunner.class) and @SpringBootTest are tasked to load the Spring application context for the test
they wont have anything to do if there arent any test methods.
 */
public class TacoCloudApplicationTests {

  @Test                         // The test method
  public void contextLoads() {
  }

}
