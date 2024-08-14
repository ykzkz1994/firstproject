package me.shinsunyoung.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private MemberRepository memberRepository;


    public List<Member> getAllMembers() {
        return memberRepository.findAll();
        /*멤버 목록얻기*/
    }
}
