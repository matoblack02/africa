package co.ke.africacallingsafaris.backendservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value="/admin")
    public String index(){
        return "index";
    }
}
