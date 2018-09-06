package com.geekerstar.dao;

import com.geekerstar.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/9/6 14:33
 * @Description:
 */
@Repository
public interface UserDao {
    public User getUser(@Param("username") String username, @Param("password") String password);
}
