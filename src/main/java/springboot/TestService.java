package me.evansong.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired  //MemberRepository 빈 주입
    MemberRepository memberRepository;

    // 회원 정보 조회
    public List<Member> getAllMembers() {
        return memberRepository.findAll();  //멤버 리포지토리에서 모든 회원 정보 불러오기
    }
}
