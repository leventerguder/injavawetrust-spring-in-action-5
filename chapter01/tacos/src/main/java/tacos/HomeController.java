package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller            // The Controller
public class HomeController {

    @GetMapping("/")     // Handles request for root path
    public String home() {
        return "home";     // return the view name
    }
  /*
   The template name is derived from the logical view name by prefixing it with /templates/ and postfixing it with .html.
   The resulting path for the template is /templates/home.html.
   Therefore, you’ll need to place the template in your project at /src/main/resources/templates/home.html.

   */

}
