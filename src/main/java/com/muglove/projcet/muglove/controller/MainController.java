package com.muglove.projcet.muglove.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //이 클래스가 컨트롤러라는걸 인식하게 함.
public class MainController {
    @PostMapping("/join")
    public String join(){
        return "User/Join";
    }
}
