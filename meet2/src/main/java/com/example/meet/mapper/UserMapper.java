package com.example.meet.mapper;

import com.example.meet.bean.User;
import org.apache.ibatis.annotations.Mapper;
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
}
