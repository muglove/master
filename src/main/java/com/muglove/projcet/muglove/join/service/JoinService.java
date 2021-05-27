package com.muglove.projcet.muglove.join.service;

import com.muglove.projcet.muglove.join.dto.MemberDto;
import com.muglove.projcet.muglove.join.entity.JoinRepository;
import com.muglove.projcet.muglove.join.entity.Member;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class JoinService {


    private JoinRepository joinRepository;

    //repository.save == insert 구문
    @Transactional
    public void joinUser(MemberDto memberDto){ joinRepository.save(memberDto.toEntity());
    }

    //repository.findall == findAll();
    @Transactional
    public List<Member> writeUser()
    {
        return joinRepository.findAll();
    }

    @Transactional
    public int Id_Check(String user_id)
    {
        Member member=joinRepository.findByUSER_ID(user_id);
         if(user_id.equals(member.getUSER_ID()))
             return 1;
         else
             return 0;
    }
}
