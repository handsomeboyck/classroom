package com.czy.classroom.service;

import com.czy.classroom.domain.User;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 21:01 2020/3/22
 */
public interface UserService {


   /*
      登陆接口
    */
    Integer login(String studentId,String password);
  /*
      修改密码接口
   */
  void UpdateUserInfo(User user);
  /*
    注销接口
   */
  Integer DeleteUserById(Integer id);

    /*
     注册接口
     */
    Integer InsertUser(User user);



}
