package kr.ulsan.bulls.controller;

import kr.ulsan.bulls.form.MemberTypeForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SelectMemberTypeController {

    @GetMapping("/selectMemberType")
    public String selectMemberType(){
        return "selectMemberType";
    }

    @PostMapping("/selectMemberType")
    public String selectMemberType(MemberTypeForm form){
        System.out.println(form.toString());
        return "selectMemberType";
    }
}
