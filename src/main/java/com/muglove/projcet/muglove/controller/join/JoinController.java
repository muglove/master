package com.muglove.projcet.muglove.controller.join;

import com.muglove.projcet.muglove.entity.Member;
import com.muglove.projcet.muglove.entity.JoinRepository;
import com.muglove.projcet.muglove.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/member")
public class JoinController {

    @Autowired
    private JoinRepository joinRepository;


    private JoinService joinService;
    public JoinController(JoinService joinService)
    {
        this.joinService=joinService;
    }

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public void join()
    {
        System.out.println("get register");
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String postRegister(Member member)
    {
        System.out.println("post register");

        joinRepository.save(member);
        //joinService.joinUser(member);
        return "redirect:/member/create";
        //commit안됐는데?
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

    @GetMapping("/create")
    public String joinComplete(Model model){
        //List<JoinDto> joinDtoList =joinService.getUserList();
        //model.addAttribute("userList",joinDtoList);

        List<Member> memberList=joinRepository.findAll();
        model.addAttribute("memberList",memberList);
        return "member/joinOk";
    }

}
