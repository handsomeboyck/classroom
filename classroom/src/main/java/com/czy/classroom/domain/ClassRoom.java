package com.czy.classroom.domain;

import java.util.Date;

/*
  教室信息实体类
 */
public class ClassRoom {
    private Integer id;//教室编号
    private String name;//教室名称
     private Integer number;//教室可容纳最大人数
    private Integer flag;//教室是否被预约 1为空闲
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
