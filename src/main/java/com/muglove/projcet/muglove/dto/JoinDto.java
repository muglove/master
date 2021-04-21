package com.muglove.projcet.muglove.dto;

import com.muglove.projcet.muglove.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;

@Getter
@Setter
@NoArgsConstructor
public class JoinDto {

    int SEQ_NO;
    String user_id;
    String name;
    String psswd;
    String email;


}
