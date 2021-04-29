package com.muglove.projcet.muglove.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

    @GetMapping("/")
    public String list(){
        return "board/list";
    }

}
