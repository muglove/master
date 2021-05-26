package com.muglove.projcet.muglove.board.controller.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "Board")
public class BoardEntity /*extends TimeEntity*/ {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int BRD_NO; // 게시글 번호
    private String BRD_MNG_NO; // 게시판 벉호
    private String title;
    private String content;
    private String REG_USER_ID; // 등록자 ID
    private String REG_DTTM; // 등록일자+시간
    private String ALT_USER_ID; // 수정자 ID
    private String ALT_DTTM; // 수정일자+시간
    private String USE_YN;

    @Builder
    public BoardEntity(int BRD_NO, String BRD_MNG_NO, String title, String content, String REG_USER_ID, String REG_DTTM,
                       String ALT_USER_ID, String ALT_DTTM, String USE_YN) {
        this.BRD_NO = BRD_NO;
        this.BRD_MNG_NO = BRD_MNG_NO;
        this.title = title;
        this.content = content;
        this.REG_USER_ID = REG_USER_ID;
        this.REG_DTTM = REG_DTTM;
        this.ALT_USER_ID = ALT_USER_ID;
        this.ALT_DTTM = ALT_DTTM;
        this.USE_YN = USE_YN;
    }
}
