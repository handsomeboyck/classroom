package com.czy.classroom.provider;



import com.czy.classroom.domain.User;
import org.apache.ibatis.jdbc.SQL;

/**
 * user动态构建SQL
 */
public class UserProvider {

    public String UpdateUser(final User user)
    {
        return new SQL()
        {
            {
                UPDATE("user");
                if(user.getName()!=null)
                {
                    SET("name = #{name}");
                }
                if(user.getStudentId()!=null)
                {
                    SET("student_id = #{studentId}");
                }
                if(user.getPassword()!=null)
                {
                    SET("password = #{password}");
                }

                WHERE("id = #{id}");
            }
        }.toString();

    }

}
