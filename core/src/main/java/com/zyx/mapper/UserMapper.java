package com.zyx.mapper;

import com.zyx.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
//    @Select("select * from user")
    List<User> selectUserList();

    User selectUserByLoginName(@Param("loginName") String loginName);
}
