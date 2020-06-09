package com.czy.classroom.service.Impl;

import com.czy.classroom.domain.User;
import com.czy.classroom.mapper.UserMapper;
import com.czy.classroom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 21:01 2020/3/22
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer login(String studentId, String password) {
        return userMapper.login(studentId,password);
    }

    @Override
    public Integer InsertUser(User user) {
        return userMapper.InsertUser(user);
    }

    @Override
    public void UpdateUserInfo(User user) {
        userMapper.Update(user);
    }

    @Override
    public Integer DeleteUserById(Integer id) {
        return userMapper.DeleteUserById(id);
    }
}
