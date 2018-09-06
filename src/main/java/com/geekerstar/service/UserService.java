package com.geekerstar.service;

import com.geekerstar.dao.UserDao;
import com.geekerstar.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/9/6 14:33
 * @Description:
 */
@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public boolean login(String username, String password) {
        User user = userDao.getUser(username, password);
        if (user == null) {
            return false;
        }else{
            return true;
        }
    }
}
