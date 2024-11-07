package home.grupper6madspild.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    // Home page
    @GetMapping("/")
    public String homePage() {
        return "homePage";
    }

    // Forbruger pages
    @GetMapping("/forbruger")
    public String forbruger() {
        return "forbruger";
    }
    @GetMapping("/forbruger/opskrifter")
    public String opskrifter() {
        return "opskrifter";
    }
    @GetMapping("/forbruger/tips")
    public String tips() {
        return "tips";
    }

    // Virksomhed pages
    @GetMapping("/virksomhed")
    public String virksomhed() {
        return "virksomhed";
    }
    @GetMapping("/virksomhed/sporing")
    public String sporing() {
        return "sporing";
    }
    @GetMapping("/virksomhed/donation")
    public String donation() {
        return "donation";
    }

    // Organisation pages
    @GetMapping("/organisation")
    public String organisation() {
        return "organisation";
    }
    @GetMapping("/organisation/madspildgård")
    public String madspildgård() {
        return "madspildgård";
    }
    @GetMapping("/organisation/madspildhjemløse")
    public String madspildhjemløse() {
        return "madspildhjemløse";
    }
}
