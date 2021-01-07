package com.muglove.projcet.muglove.service.impl;

import com.muglove.projcet.muglove.dao.TestDao;
import com.muglove.projcet.muglove.dto.TestDto;
import com.muglove.projcet.muglove.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {
    private final TestDao testDao;

    @Override
    public List<TestDto> getBoardList() {
        List<TestDto> boardList = new ArrayList<TestDto>();
        return boardList;
    }
}
