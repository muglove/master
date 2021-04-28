package com.muglove.projcet.muglove.login.controller;

import com.muglove.projcet.muglove.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class test {

    private int SEQ_NO;
    private String USER_ID;
    private String EMAIL;
    private String NAME;
    private String PSSWD;

    public Member toEntity()
    {
        return Member.builder()
                .SEQ_NO(SEQ_NO)
                .USER_ID(USER_ID)
                .EMAIL(EMAIL)
                .NAME(NAME)
                .PSSWD(PSSWD)
                .build();
    }

    @Builder
    public test(int SEQ_NO, String USER_ID, String EMAIL, String NAME, String PSSWD)
    {
        this.SEQ_NO=SEQ_NO;
        this.USER_ID=USER_ID;
        this.EMAIL=EMAIL;
        this.NAME=NAME;
        this.PSSWD=PSSWD;
    }

}
