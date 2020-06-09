package com.czy.classroom.service.Impl;

import com.czy.classroom.domain.ClassRoom;
import com.czy.classroom.mapper.ClassRoomMapper;
import com.czy.classroom.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {
    @Autowired
    private ClassRoomMapper classRoomMapper;

    @Override
    public List<ClassRoom> findAllClassRoom() {
        return classRoomMapper.findAllClassRoom();
    }

    @Override
    public Integer InsertClassRoom(ClassRoom classRoom) {
        return classRoomMapper.InsertClassRoom(classRoom);
    }

    @Override
    public Integer deleteClassRoom(Integer id) {
        return classRoomMapper.DeleteClassRoomById(id);
    }

    @Override
    public void UpdateClassRoom(ClassRoom classRoom) {
        classRoomMapper.Update(classRoom);
    }
}
