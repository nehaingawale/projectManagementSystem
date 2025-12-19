package com.example.project_management_system.controller;

import com.example.project_management_system.model.Member;
import com.example.project_management_system.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    @Autowired
     MemberService memberService;

    // GET /api/members
    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    // POST /api/members
    @PostMapping
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }
}

