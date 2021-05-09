package com.muglove.projcet.muglove.join.entity;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JoinRepository extends JpaRepository<Member, Integer> {

    boolean existsByUSER_ID(String user_id);
}
