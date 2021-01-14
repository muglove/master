package com.muglove.projcet.muglove.controller;

import com.muglove.projcet.muglove.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping("/board")
    public String getBoard() {
        return "board/list";
    }
}
