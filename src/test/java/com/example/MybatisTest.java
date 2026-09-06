package com.example;

import com.chapter01.UserMapper;
import com.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * MyBatis 测试类（JUnit 4）
 *
 * 运行前请确认：
 *  1. 已执行 sql/User_db.sql 完成建库建表并插入 10 条测试数据；
 *  2. src/main/resources/common/db.properties 中
 *     jdbc.url / jdbc.username / jdbc.password 与本机 MySQL 一致；
 *  3. 在 IDEA 中：右键 MybatisTest -> Run 'MybatisTest.testFindAll'
 */
public class MybatisTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        assertNotNull("找不到资源 mybatis-config.xml", in);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        in.close();
        System.out.println("=== SqlSessionFactory 创建成功 ===");
    }

    /** 查询全部用户：调用 UserMapper.findAllByxml() */
    @Test
    public void testFindAll() {
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> users = userMapper.findAllByxml();
            assertNotNull(users);
            assertTrue("user 表中没有数据，请先执行 sql/User_db.sql", users.size() > 0);
            System.out.println("=== findAllByxml() 查询到 " + users.size() + " 条数据 ===");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
