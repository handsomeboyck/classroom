package com.czy.classroom.provider;

import com.czy.classroom.domain.ClassRoom;
import com.czy.classroom.domain.Record;
import com.czy.classroom.domain.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Author: czy
 * @Description:
 * @Date: Create in 21:25 2020/4/4
 */
public class ClassRoomProvider {
    public String UpdateClassRoom(final ClassRoom classRoom)
    {
        return new SQL()
        {
            {
                UPDATE("classroom");
                if(classRoom.getName()!=null)
                {
                    SET("name = #{name}");
                }
                if(classRoom.getFlag()!=null)
                {
                    SET("flag = #{flag}");
                }
                if(classRoom.getNumber()!=null)
                {
                    SET("number = #{number}");
                }

                WHERE("id = #{id}");
            }
        }.toString();

    }
}
