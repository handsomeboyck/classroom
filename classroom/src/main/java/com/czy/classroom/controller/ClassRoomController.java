package com.czy.classroom.controller;

import com.czy.classroom.domain.ClassRoom;
import com.czy.classroom.domain.JsonData;
import com.czy.classroom.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pub")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    /*
     查询所有教室
     */
    @RequestMapping("findAllClassRoom")
    public JsonData findAllClassRoom()
    {
        return JsonData.buildSuccess(classRoomService.findAllClassRoom());
    }

    /*
    新增教室
     */
    @PostMapping("InsertClassRoom")
    public JsonData InsertClassRoom(@RequestBody ClassRoom classRoom)
    {
        return JsonData.buildSuccess(classRoomService.InsertClassRoom(classRoom));



    }
    /*
    修改教室信息
     */

    @PostMapping("UpdateClassRoom")
    public  JsonData updateClassRoom(@RequestBody ClassRoom classRoom)
    {
        classRoomService.UpdateClassRoom(classRoom);
        return JsonData.buildSuccess(classRoom.getId()+"号教室信息修改成功");
    }
   /*
    删除教室
    通过教室id
    */
    @RequestMapping("deleteClassRoom")
    public JsonData DeleteClassRoomById(Integer id)
    {
        return JsonData.buildSuccess(classRoomService.deleteClassRoom(classRoomService.deleteClassRoom(id)));
    }


}
