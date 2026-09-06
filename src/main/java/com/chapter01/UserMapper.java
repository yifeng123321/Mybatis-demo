package com.chapter01;

import com.entity.User;

import java.util.List;

/**
 * chapter01 章节 Mapper 接口
 * <p>
 * 对应映射文件：resources/chapter01/mapper/UserMapper.xml
 * 规则：
 * - 接口全限定名 = XML 中的 namespace
 * - 方法名       = XML 中语句的 id
 * - 参数/返回值与 XML 中 parameterType / resultType 对应
 */
public interface UserMapper {

    /* ==================== 原有方法（保持兼容）==================== */

    /** 查询所有用户 */
    List<User> findAllByxml();

    /** 测试查询（固定查询 zhangsan） */
    User testfind();

    /** 根据 id 查询用户 */
    User findById(int id);

    /** 添加用户 */
    int addUser(User user);

    /** 更新用户 */
    int updateUser(User user);

    /** 删除用户 */
    int deleteUser(int id);

    /* ==================== 别名方法（与 HTML 教学一致）==================== */

    /** 根据 id 查询用户 */
    User selectById(int id);

    /** 添加用户 */
    int insert(User user);

    /** 更新用户 */
    int update(User user);

    /** 删除用户 */
    int deleteById(int id);

    /** 查询所有用户 */
    List<User> selectAll();
}
