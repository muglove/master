package com.muglove.projcet.muglove.board.controller.repository;

import com.muglove.projcet.muglove.board.controller.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
