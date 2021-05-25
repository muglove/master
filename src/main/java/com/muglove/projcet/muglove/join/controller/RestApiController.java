package com.muglove.projcet.muglove.join.controller;

import com.muglove.projcet.muglove.join.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {


    private JoinService joinService;

    @GetMapping("user/checkUserIdExist/{user_id}")
    public String checkUserIdExist(@PathVariable String user_id)
    {
            return "아이디 사용 가능";
    }
}
