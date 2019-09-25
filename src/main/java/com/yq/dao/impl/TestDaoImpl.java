package com.yq.dao.impl;

import com.yq.dao.TestDao;
import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao {
    public void printHello() {
        System.out.println("DAO: Hello World!!");
    }
}
