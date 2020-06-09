package com.czy.classroom.mapper;

import com.czy.classroom.domain.ClassRoom;
import com.czy.classroom.domain.User;
import com.czy.classroom.provider.ClassRoomProvider;
import com.czy.classroom.provider.UserProvider;
import org.apache.ibatis.annotations.*;


import java.util.List;
//Dao层
public interface ClassRoomMapper {

    /*
     查询所有教室
     */
    @Select("select * from classroom")
    List<ClassRoom> findAllClassRoom();
    /*
    通过id查询单个教室信息
     */
    @Select("select * from classroom where id = #{id}")
    ClassRoom findClassRoomById(Integer id);

    /*
     通过id删除教室
     */
    @Delete("delete from classroom where id = #{id}")
    Integer DeleteClassRoomById(Integer id);
   /*
     更新教室信息
    */
   @UpdateProvider(type = ClassRoomProvider.class,method = "UpdateClassRoom")
   void Update(ClassRoom classRoom);
    /*
      新增新教室
     */
    @Insert("insert into classroom(name,number,flag,date) values(#{name},#{number},#{flag},#{date})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    Integer InsertClassRoom(ClassRoom classRoom);




}
