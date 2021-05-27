package com.muglove.projcet.muglove.join.entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JoinRepository extends JpaRepository<Member, Integer> {
    @Query("select m from Member AS m where m.USER_ID=?1")
    Member findByUSER_ID(String user_id);
}
