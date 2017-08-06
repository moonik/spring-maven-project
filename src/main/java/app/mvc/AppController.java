package app.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Value("${profile.name}")
    private String value;

    @RequestMapping("/")
    public String test(Model model){
        System.out.println(value);
        model.addAttribute("profile", value);
        return "view";
    }
}
