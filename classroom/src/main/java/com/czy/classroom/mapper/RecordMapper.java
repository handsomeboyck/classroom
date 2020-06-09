package com.czy.classroom.mapper;

import com.czy.classroom.domain.ClassRoom;
import com.czy.classroom.domain.Record;
import com.czy.classroom.domain.User;
import com.czy.classroom.provider.ClassRoomProvider;
import com.czy.classroom.provider.RecordProvider;
import com.czy.classroom.provider.UserProvider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface RecordMapper {
    /*
     查询所有预约记录
     */
    @Select("select * from record")
    List<Record> findAllRecrod();
   /*
   修改预约记录
    */
   @UpdateProvider(type = RecordProvider.class,method = "UpdateRecord")
   void Update(Record record);
   /*
   删除预约记录
    */
    @Delete("delete from record where id = #{id}")
    Integer deleteClassRoomById(Integer id);
    /*
     插入预约记录
     */
    @Insert("insert into record(room_id,number,date) values(#{roomId},#{number},#{date})")
    Integer InsertRecrod(Record record);
}
