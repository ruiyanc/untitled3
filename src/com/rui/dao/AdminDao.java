package com.rui.dao;

import com.rui.web.model.Admin;

import javax.sql.DataSource;
import java.util.List;

public interface AdminDao {
    void setDataSource(DataSource ds);
    void addAdmin(String username, String password);

    Admin getAdmin(int id);
    List<Admin> listAdmins();
}
