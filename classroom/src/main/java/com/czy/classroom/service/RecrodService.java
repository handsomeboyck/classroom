package com.czy.classroom.service;

import com.czy.classroom.domain.Record;
import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface RecrodService {
    /*
    查询所有预约记录
     */
    List<Record> findAllRecrod();
   /*
     删除预约记录
    */
   Integer DeleteRecordById(Integer id);
   /*
   更新预约记录
    */
   void UpdateRecord(Record record);
    /*
    新增预约记录
     */
    Integer InsertRecrod(Record record);
}
