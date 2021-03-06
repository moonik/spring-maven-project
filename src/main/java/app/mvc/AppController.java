package app.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Value("${app.version}")
    private String version;
    @Value("${os.name}")
    private String osName;
    @Value("${java.home}")
    private String javaHome;
    @Value("${basedir}")
    private String basedir;
    @Value("${spring.version}")
    private String springVersion;
    @Value("${myFilteredProperty}")
    private String filter;

    @RequestMapping("/")
    public String test(Model model){
        model.addAttribute("version", version);
        model.addAttribute("osName", osName);
        model.addAttribute("javaHome", javaHome);
        model.addAttribute("basedir", basedir);
        model.addAttribute("springVersion", springVersion);
        model.addAttribute("filter", filter);
        return "view";
    }
}
