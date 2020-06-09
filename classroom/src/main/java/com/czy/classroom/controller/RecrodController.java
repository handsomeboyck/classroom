package com.czy.classroom.controller;

import com.czy.classroom.domain.JsonData;
import com.czy.classroom.domain.Record;
import com.czy.classroom.service.RecrodService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.Date;

@RestController
@RequestMapping("pub")
public class RecrodController {
    @Autowired
    private RecrodService recrodService;
   /*
    查询所有预约记录
    */
    @RequestMapping("findAllRecord")
    public JsonData findAllRecrod()
    {
        return JsonData.buildSuccess(recrodService.findAllRecrod());

    }

   /*
   新增预约记录
    */
    @PostMapping("InsertRecord")
    public JsonData InsertRecord(@RequestBody Record record)
    {
        record.setDate(new Date());
        return JsonData.buildSuccess(recrodService.InsertRecrod(record));

    }

    /*
    修改预约记录
     */
    @PostMapping("updateRecord")
    public JsonData UpdateRecord(@RequestBody Record record)
    {
        recrodService.UpdateRecord(record);
        return JsonData.buildSuccess(record.getId()+"号记录修改成功");
    }
    /*
    删除预约记录
     */
    @RequestMapping("deleteRecordById")
    public JsonData deleteRecord(Integer id)
    {
        return JsonData.buildSuccess(recrodService.DeleteRecordById(id));
    }
}
