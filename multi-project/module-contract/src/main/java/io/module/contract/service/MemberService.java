package io.module.contract.service;

import io.module.common.domain.Member;
import io.module.common.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup (Member member) {
        return memberRepository.save(member).getId();
    }

    public List<Member> getMembers(){
        return memberRepository.findAll();
    }
}
