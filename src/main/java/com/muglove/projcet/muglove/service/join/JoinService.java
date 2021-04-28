package com.muglove.projcet.muglove.service.join;

import com.muglove.projcet.muglove.dto.joinDto.MemberDto;
import com.muglove.projcet.muglove.entity.JoinRepository;
import com.muglove.projcet.muglove.entity.Member;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class JoinService {

    @Autowired
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
