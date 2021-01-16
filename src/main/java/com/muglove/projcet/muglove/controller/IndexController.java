package com.muglove.projcet.muglove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String Index(){
        return "index";
    }

    /*
    @GetMapping("/joinForm")
    public String joinForm(){
        return "User/join";
    }

*/

    @GetMapping("/loginForm")
    public String LoginForm(){
        return "User/login";
    }
    @GetMapping("/join")
    public String join()
    {
        return "User/Join";
    }

}
