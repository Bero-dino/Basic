package com.bero.basic.service;

import com.bero.basic.entity.Member;
import com.bero.basic.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasicService {
    private final MemberRepository memberRepository;

    public BasicService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<String> getMemberList() {
        List<Member> members = memberRepository.findAll();
        System.out.println(members);
        List<String> list = new ArrayList<>();

        for (Member member : members) {
            list.add(member.getName());
        }

        return list;
    }
}
