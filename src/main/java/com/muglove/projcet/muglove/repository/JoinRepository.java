package com.muglove.projcet.muglove.repository;


import com.muglove.projcet.muglove.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinRepository extends JpaRepository<Member, Long> {

}
