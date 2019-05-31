package com.rui.service.impl;

import com.rui.dao.impl.UserDaoImpl;
import com.rui.service.UserService;
import com.rui.web.model.User;

public class UserServiceImpl implements UserService {
    UserDaoImpl dao = new UserDaoImpl();
    @Override
    public void regist(User user) {
        dao.regist(user);
    }
}
