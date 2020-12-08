package com.tennis.spring.service.impl;

import com.tennis.spring.dao.OrderDao;
import com.tennis.spring.dao.UserDao;
import com.tennis.spring.service.OrderService;
import com.tennis.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public void add() {
        userDao.add();
    }
}
