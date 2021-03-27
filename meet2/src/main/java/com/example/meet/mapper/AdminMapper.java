package com.example.meet.mapper;

import com.example.meet.bean.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created on 2021/3/27.
 *
 * @author Chen Yao
 */
@Mapper
public interface AdminMapper {
    @Insert("Insert into admin values(#{adminid}, #{password}, #{meetingid}, #{identity})")
    public Integer insAdmin(@Param("adminid") String adminid, @Param("password") String password,
                            @Param("meetingid") Integer meetingid, @Param("identity") Integer identity);
}
