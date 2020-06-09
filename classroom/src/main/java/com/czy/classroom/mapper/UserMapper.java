package com.czy.classroom.mapper;

import com.czy.classroom.domain.User;
import com.czy.classroom.provider.UserProvider;
import org.apache.ibatis.annotations.*;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 20:56 2020/3/22
 */
///MVC
public interface UserMapper {
    //登陆时查询用户是否存在数据库中
    @Select("select count(*) from user where student_id = #{studentId} and password = #{password} ")
    Integer login(@Param("studentId")String studentId,@Param("password")String password);

   //新用户注册
    @Insert("insert into user(student_id,name,password) values(#{studentId},#{name},#{password})")
    Integer InsertUser(User user);

    //用户信息更新
    @UpdateProvider(type = UserProvider.class,method = "UpdateUser")
   void Update(User user);

    //用户注销
    @Delete("delete from user where id = #{id}")
    Integer DeleteUserById(Integer id);

}
