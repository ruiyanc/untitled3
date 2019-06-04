package com.rui.domain;

import com.rui.web.model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {

        //创建对象
        Admin user = new Admin();
        user.setUsername("wwww");
        user.setPassword("123");

        //获取加载配置管理类
        Configuration configuration = new Configuration();

        //不给参数就默认加载hibernate.cfg.xml文件，
        configuration.configure();

        //创建Session工厂对象
        SessionFactory factory = configuration.buildSessionFactory();
        //得到Session对象
        Session session = factory.openSession();

        //使用Hibernate操作数据库，得到事务对象并开启事务
        Transaction transaction = session.beginTransaction();

        //把对象添加到数据库中
//        session.save(user);

        Query query = session.createQuery("FROM Admin ");
        List list = query.list();
        for (Object object : list) {
            Admin admin = (Admin) object;
            System.out.print("id:" + admin.getId() + "  ");
            System.out.print("username:" + admin.getUsername() + "  ");
            System.out.print("password:" + admin.getPassword() + "  ");
            System.out.println(" ");
        }
//        User user1 =  session.load(User.class, 1);
//        System.out.println(user1);
        //提交事务
        transaction.commit();

        //关闭Session
        session.close();
    }
}

