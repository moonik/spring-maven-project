package app.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Properties;

@Controller
public class AppController {
    @Value("${profile}")
    private String value;

    @RequestMapping("/")
    public String test(Model model){
        model.addAttribute("profile", value);
        return "view";
    }
}
