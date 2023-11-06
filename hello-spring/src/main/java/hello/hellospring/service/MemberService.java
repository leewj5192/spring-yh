package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private  final MemberRepository memberRepository = new MemoryMemberRepository();

//    회원가입
    public Long join(Member member){

        Optional<Member> byName = memberRepository.findByName(member.getName());

        memberRepository.save(member);
      return  member.getId();
    }
}
