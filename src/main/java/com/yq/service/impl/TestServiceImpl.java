package com.yq.service.impl;

import com.yq.dao.TestDao;
import com.yq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    public void printHello() {
        dao.printHello();
        System.out.println("Service: Hello World!");
    }
}
