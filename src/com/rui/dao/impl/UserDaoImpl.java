package com.rui.dao.impl;

import com.rui.dao.UserDao;
import com.rui.web.model.User;

import java.sql.*;

public class UserDaoImpl implements UserDao {
    Connection connection = null;
    PreparedStatement ps = null;
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/status_test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC",
                    "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void regist(User user) {
        String sql = "insert into user values( ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setDate(3, null);
            ps.setString(4, user.getHobby());
            ps.setBoolean(5, user.getMarried());
            ps.executeUpdate();
            ps.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
