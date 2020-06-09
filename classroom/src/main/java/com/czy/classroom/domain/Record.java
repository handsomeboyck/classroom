package com.czy.classroom.domain;

import java.util.Date;

/*
  预约记录实体类
 */
public class Record {
    private Integer id;//预约编号
    private Integer roomId;//教室编号
    private Integer number;//教室可容纳人数
    private Date date;//预约日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
