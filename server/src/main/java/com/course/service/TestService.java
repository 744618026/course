package com.course.service;

import com.course.domain.Test;
import com.course.domain.TestExample;
import com.course.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        testExample.setOrderByClause("id asc");
        return testMapper.selectByExample(null);
    }
}
