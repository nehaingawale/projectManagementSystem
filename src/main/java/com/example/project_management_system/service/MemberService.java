package com.example.project_management_system.service;

import org.springframework.stereotype.Service;
import com.example.project_management_system.model.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MemberService {

    private List<Member> memberList = new ArrayList<>();
    private AtomicLong idCounter = new AtomicLong(1);

    public List<Member> getAllMembers() {
        return memberList;
    }

    public Member createMember(Member member) {
        member.setId(idCounter.getAndIncrement());
        memberList.add(member);
        return member;
    }
}
