package home.grupper6madspild.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }
}
