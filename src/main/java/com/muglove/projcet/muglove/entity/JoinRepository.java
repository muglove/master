package com.muglove.projcet.muglove.entity;


import com.muglove.projcet.muglove.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinRepository extends JpaRepository<Member, Integer> {

}
