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

    @Select("SELECT * FROM user")
    public List<User> getAllUser();

    @Insert("SELECT * from user where userid = #{userid}")
    public Integer searchUser(@Param("userid") String userid);

    @Select("SElECT * FROM user where name = #{name} and password = #{password}")
    public User accessLogin(@Param("name") String userid,@Param("password") String password);

    @Insert("INSERT INTO user (name,password,meetingid) values(#{username},#{userpassword},#{usermeetingid})")
    public Integer registerUser(@Param("username") String username,@Param("userpassword") String password,
                                @Param("usermeetingid") Integer usermeeting);
}
