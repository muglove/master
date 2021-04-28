package com.muglove.projcet.muglove.dto.joinDto;

import com.muglove.projcet.muglove.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.print.attribute.standard.MediaSize;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

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
    public MemberDto(int SEQ_NO,String USER_ID,String EMAIL, String NAME, String PSSWD)
    {
        this.SEQ_NO=SEQ_NO;
        this.USER_ID=USER_ID;
        this.EMAIL=EMAIL;
        this.NAME=NAME;
        this.PSSWD=PSSWD;
    }

}
