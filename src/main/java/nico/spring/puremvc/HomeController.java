package nico.spring.puremvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
class HomeController {

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model){
        System.out.println ("HomeController.showHomePage()");

        model.put ("now", new Date());

        return "home";

    }
}

