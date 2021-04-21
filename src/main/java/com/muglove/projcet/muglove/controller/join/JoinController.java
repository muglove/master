package com.muglove.projcet.muglove.controller.join;

import com.muglove.projcet.muglove.dto.JoinDto;
import com.muglove.projcet.muglove.entity.Member;
import com.muglove.projcet.muglove.repository.JoinRepository;
import com.muglove.projcet.muglove.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class JoinController {

    @Autowired
    private JoinRepository joinRepository;

    /*
    private JoinService joinService;
    public JoinController(JoinService joinService)
    {
        this.joinService=joinService;
    }
     */

    @RequestMapping("/join")
    public List<Member> join()
    {
        List<Member> memberList=joinRepository.findAll();
        System.out.println("안녕하세요");
        return memberList;
    }

    /*
    @PostMapping("/create")
    public String joinComplete(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        System.out.println("안녕");
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("password"));
        System.out.println("안녕");
        return "joinOk";
    }
     */

    @PostMapping("/create")
    public String joinComplete(Model model){
        //List<JoinDto> joinDtoList =joinService.getUserList();
        //model.addAttribute("userList",joinDtoList);


        return "joinOk";
    }

}
