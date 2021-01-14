package com.muglove.projcet.muglove.controller;

import com.muglove.projcet.muglove.dto.TestDto;
import com.muglove.projcet.muglove.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/main")
public class TestController {
    @Autowired
    TestService service;

    @ResponseBody
    @RequestMapping("/board")
    public String getBoard() {
        return "board/board.html";
    }
}
