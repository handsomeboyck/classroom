package com.czy.classroom.service;

import com.czy.classroom.domain.ClassRoom;

import java.util.List;

public interface ClassRoomService {
    /*
    查询所有教室
     */
    List<ClassRoom> findAllClassRoom();
  /*
  新增教室
   */
    Integer InsertClassRoom(ClassRoom classRoom);
    /*
    删除教室
     */
    Integer deleteClassRoom(Integer id);
    /*
    更新教室信息
     */
    void  UpdateClassRoom(ClassRoom classRoom);
}
