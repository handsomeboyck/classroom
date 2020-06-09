package com.czy.classroom.controller;

import com.czy.classroom.domain.JsonData;
import com.czy.classroom.domain.User;
import com.czy.classroom.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 21:05 2020/3/22
 */

@RestController
@RequestMapping("pub")
public class UserController {
   @Autowired
   private UserService userService;

   /*
   用户登陆
    */
   @RequestMapping("login")
   public JsonData login(@Param("studentId") String studentId,@Param("password") String password)
   {
       if (userService.login(studentId,password)==1)
       {
           System.out.println(userService.login(studentId,password));
           return JsonData.buildSuccess("登陆成功");
       }
       else
           return JsonData.buildError("登陆失败");
   }

   /*
   用户信息插入
    */

   @RequestMapping("insertUser")
    public JsonData InsertUser(@RequestBody User user)
   {
       return JsonData.buildSuccess(userService.InsertUser(user));
   }

   /*
   用户信息更新
    */
   @RequestMapping("UpdateUser")
    public JsonData UpdateUser(@RequestBody User user)
   {
       userService.UpdateUserInfo(user);
       return JsonData.buildSuccess("学号为"+user.getStudentId()+"的同学信息修改成功");
   }
   /*
   用户信息删除
    */
   @RequestMapping("deleteUserById")
    public JsonData DeleteUserById(Integer id)
   {
       return JsonData.buildSuccess(userService.DeleteUserById(id));
   }

}
