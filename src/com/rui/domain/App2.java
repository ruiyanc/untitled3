package com.rui.domain;

import com.rui.dao.impl.AdminDaoImpl;
import com.rui.web.model.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AdminDaoImpl bean = (AdminDaoImpl)context.getBean("adminJDBCTemplate");
        bean.addAdmin("张三", "123");
        bean.addAdmin("李四", "123");
        List<Admin> admins = bean.listAdmins();
        for (Admin admin : admins) {
            System.out.println(admin.getUsername());
            System.out.println(admin.getPassword());
        }
    }
}
