package taesin.spring.service;

import taesin.spring.domain.Member;
import taesin.spring.repository.MemberRepository;
import taesin.spring.repository.MemoryMemberRepository;

public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    // 회원가입
    public Long join(Member member) {
        //같은 이름 회원가입 방지
        memberRepository.findByName(member.getName());
        memberRepository.save(member);
        return member.getId();
    }
}
