package com.muglove.projcet.muglove.conroller;

import com.muglove.projcet.muglove.dto.TestDto;
import com.muglove.projcet.muglove.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/main")
public class TestContoller {
    @Autowired
    TestService service;

    @ResponseBody
    @RequestMapping("/test/stock")
    public Map<String, String> stockName() {
        String stockId = "";
        String stockName = "";

        try {
            List<TestDto> dtos = service.getBoardList();
            TestDto dto = dtos.get(1);
        } catch (Exception e){
            System.out.println("");
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("stockId", "001");
        map.put("stockName", "신한은행");
        return map;
    }
}
