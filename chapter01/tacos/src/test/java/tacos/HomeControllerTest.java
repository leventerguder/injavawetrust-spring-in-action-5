package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)   // Web test for HomeController
/*
 Instead of @SpringBootTest , HomeControllerTest is annotated with @WebMvcTest
 This is a special test annotation provided by Spring Boot that arranges for the test to run in the
 context of a Spring MVC application.
 More specifically, in this case, it arranges for HomeController to be registered in Spring MVC so that
 you can throw requests against it
 */
public class HomeControllerTest {

  @Autowired
  private MockMvc mockMvc;   // Inject MockMvc

  @Test
  public void testHomePage() throws Exception {
    mockMvc.perform(get("/"))    // Performs HTTP GET /
    
      .andExpect(status().isOk())  // Expects HTTP 200
      
      .andExpect(view().name("home"))  // Expects home view
      
      .andExpect(content().string(           // Expects Welcome to
          containsString("Welcome to...")));  
  }

}
