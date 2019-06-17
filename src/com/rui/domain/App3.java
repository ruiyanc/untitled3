package com.rui.domain;

import com.rui.mapper.UserMapper;
import com.rui.web.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException {
//        加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
//        通过SqlSessionFactoryBuilder创建SqlSessionFactory会话工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//        通过SqlSessionFactory创建SqlSession
        SqlSession session = sessionFactory.openSession();
//        SqlSession操作数据库
//        User user = session.selectOne("findUserByName", "张三");
        UserMapper userMapper = session.getMapper(UserMapper.class);
//        List<User> users = session.selectList("findUserByName", "123");
//        System.out.println(users);
        System.out.println(userMapper.findUserByName("李四"));
        System.out.println(userMapper.findUserAll());
//        User user = new User("qqq", "x", new Date(), "xxx", false);
//        userMapper.save(user);
        session.commit();
//        关闭sqlSession
        session.close();
    }
}
