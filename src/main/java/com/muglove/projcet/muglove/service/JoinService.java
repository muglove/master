package com.muglove.projcet.muglove.service;

import com.muglove.projcet.muglove.dto.JoinDto;
import com.muglove.projcet.muglove.entity.Member;
import com.muglove.projcet.muglove.repository.JoinRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class JoinService {

    private JoinRepository joinRepository;

    public JoinService(JoinRepository joinRepository)
    {
        this.joinRepository=joinRepository;
    }
/*
    @Transactional
    public int savaUser(JoinDto joinDto){
        return joinRepository.save(joinDto.toEntity()).getSEQ_NO();
    }

    @Transactional
    public List<JoinDto> getUserList()
    {
        List<Member> joinUsers= joinRepository.findAll();
        List<JoinDto> joinDtoList=new ArrayList<>();

        for(Member member:joinUsers)
        {
            JoinDto joinDto = JoinDto.builder()
                    .SEQ_NO(member.getSEQ_NO())
                    .user_id(member.getUSER_ID())
                    .name(member.getEMAIL())
                    .psswd(member.getPSSWD())
                    .email(member.getEMAIL())
                    .build();
            joinDtoList.add(joinDto);
        }

        return joinDtoList;
    }

 */

}
