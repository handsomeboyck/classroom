package com.czy.classroom.provider;

import com.czy.classroom.domain.Record;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 21:24 2020/4/4
 */
public class RecordProvider {
    public String UpdateRecord(final Record record) {
        return new SQL() {
            {
                UPDATE("record");


                if (record.getRoomId() != null) {
                    SET("room_id = #{roomId}");
                }
                if (record.getNumber() != null) {
                    SET("number = #{number}");
                }

                WHERE("id = #{id}");
            }
        }.toString();
    }
}
