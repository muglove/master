package com.muglove.projcet.muglove.join.controller;

import com.muglove.projcet.muglove.join.dto.MemberDto;
import com.muglove.projcet.muglove.join.entity.Member;
import com.muglove.projcet.muglove.join.service.JoinService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class JoinController {

    @Autowired
    private JoinService joinService;

    @GetMapping("/join/join")
    public String join(Model model)
    {
        model.addAttribute("member",new MemberDto());

        return "/join/join";
    }

    @PostMapping("/join/join")
    public String postJoin(MemberDto memberDto)
    {
        joinService.joinUser(memberDto);

        return "redirect:/join/create";
    }

    @GetMapping("join/create")
    public String joinComplete(Model model){
        //List<JoinDto> joinDtoList =joinService.getUserList();
        //model.addAttribute("userList",joinDtoList);

        List<Member> memberList=joinService.writeUser();
        model.addAttribute("memberList",memberList);
        return "join/joinOk";
    }
    /*
    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public void join()
    {
        System.out.println("get register");
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String postRegister(MemberDto memberdto)
    {
        System.out.println("post register");

        joinService.joinUser(memberdto);
        //joinService.joinUser(member);
        return "redirect:/member/create";
        //commit안됐는데?
    }


*/
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



}
