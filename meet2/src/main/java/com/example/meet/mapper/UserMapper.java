package com.example.meet.mapper;

import com.example.meet.bean.User;
import com.example.meet.bean.UserShow;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 12:37 2021/3/27
 */
@Mapper
public interface UserMapper {

    @Select("SELECT userid,name,meetingid FROM user")
    public List<UserShow> getAllUser();

    @Insert("INSERT INTO user VALUES(#{userid},#{name},#{password},#{meetingid})")
    public Integer registerUser(@Param("userid") String userid, @Param("name") String name,
                                @Param("password") String password, @Param("meetingid") Integer meetingid);


}
