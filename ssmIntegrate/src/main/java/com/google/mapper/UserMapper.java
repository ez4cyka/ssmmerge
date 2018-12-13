package com.google.mapper;

import com.google.domain.User;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    /**
     * 根据id查询用户
     * @param id
     */
    User queryUserById(@Param("id") Long id);

    void deleteUserById(@Param("id") Long id);
}
