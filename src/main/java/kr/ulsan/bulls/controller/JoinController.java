package kr.ulsan.bulls.controller;


import kr.ulsan.bulls.form.MemberForm;
import kr.ulsan.bulls.service.JoinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService){
        this.joinService = joinService;

    }
    @GetMapping("/join")
    private String Join(){
        return "join";
    }

    @PostMapping("/join")
    private String setMemberInfo(MemberForm form){

        System.out.println(form.toString());
        joinService.Join(form);

        return "joinComplite";
    }
}

