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

    @Transactional
    public void joinUser(MemberDto memberDto){
       joinRepository.save(memberDto.toEntity());
    }

    @Transactional
    public List<Member> writeUser()
    {
        return joinRepository.findAll();
    }

}
