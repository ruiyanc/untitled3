package com.rui.mapper;

import com.rui.web.model.User;

import java.util.List;

public interface UserMapper {
    /**
     *
     * @param user
     * @return 受影响的行数
     */
    int save(User user);

    User findUserByName(String username);

    List<User> findUserAll();
}
