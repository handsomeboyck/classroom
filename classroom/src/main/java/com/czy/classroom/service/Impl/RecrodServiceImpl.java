package com.czy.classroom.service.Impl;

import com.czy.classroom.domain.Record;
import com.czy.classroom.mapper.RecordMapper;
import com.czy.classroom.service.RecrodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecrodServiceImpl implements RecrodService
{

    @Autowired
    private RecordMapper recordMapper;

    @Override
    public List<Record> findAllRecrod() {
        return recordMapper.findAllRecrod();
    }

    @Override
    public Integer InsertRecrod(Record record) {
        return recordMapper.InsertRecrod(record);
    }

    @Override
    public Integer DeleteRecordById(Integer id) {
       return recordMapper.deleteClassRoomById(id);
    }

    @Override
    public void UpdateRecord(Record record) {
        recordMapper.Update(record);

    }
}
