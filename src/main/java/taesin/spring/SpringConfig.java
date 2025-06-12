package taesin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taesin.spring.repository.MemberRepository;
import taesin.spring.repository.MemoryMemberRepository;
import taesin.spring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
