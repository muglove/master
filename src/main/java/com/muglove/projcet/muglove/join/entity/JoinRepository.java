package com.muglove.projcet.muglove.join.entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface JoinRepository extends JpaRepository<Member, Integer> {

}
