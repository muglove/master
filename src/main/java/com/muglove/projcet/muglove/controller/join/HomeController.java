package com.muglove.projcet.muglove.controller.join;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String welcome()
    {
        return "home";
    }

}
