package com.muglove.projcet.muglove.controller;


import com.muglove.projcet.muglove.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller //이 클래스가 컨트롤러라는걸 인식하게 함.
public class UserController {
    @PostMapping("/create")
    public String create(User user){
        System.out.println("User:"+user );
        return "index";
    }
}
