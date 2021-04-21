package com.muglove.projcet.muglove.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="member")
@Getter
@Setter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private int SEQ_NO;
    private String USER_ID;
    private String EMAIL;
    private String NAME;
    private String PSSWD;

}
