package com.rui.dao.impl;

import com.rui.dao.AdminDao;
import com.rui.domain.AdminMapper;
import com.rui.web.model.Admin;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class AdminDaoImpl implements AdminDao {
    private DataSource ds;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        this.ds = ds;
        this.jdbcTemplate = new JdbcTemplate(ds);
    }

    @Override
    public void addAdmin(String username, String password) {
        String sql = "insert into admin values(null,?,?)";
        jdbcTemplate.update(sql, username, password);
        System.out.println("新增的用户和密码为：" + username + " " + password);
    }

    @Override
    public Admin getAdmin(int id) {
        return null;
    }

    @Override
    public List<Admin> listAdmins() {
        String sql = "select * from admin";
        return jdbcTemplate.query(sql, new AdminMapper());
    }

}
