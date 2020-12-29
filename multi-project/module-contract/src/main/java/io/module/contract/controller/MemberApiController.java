package io.module.contract.controller;

import io.module.common.domain.Member;
import io.module.contract.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class MemberApiController {

    @Autowired
    private MemberService memberService;

    @PostConstruct
    public void init() {
        this.memberService.signup(new Member("mg", "mg@nhntoast.com"));
    }

    @GetMapping({"/"})
    public List<Member> getMembers() {
        return this.memberService.getMembers();
    }
}
