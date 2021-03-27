package com.example.meet.mapper;

import com.example.meet.bean.Admin;
import com.example.meet.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: shuKai
 * @Description:
 * @Date: Create in 19:11 2021/3/27
 */
@Mapper
public interface AdminMapper {

    @Select("SElECT * FROM admin where adminid = #{adminid} and password = #{password}")
    public Admin accessLogin(@Param("adminid") String userid, @Param("password") String password);
}
