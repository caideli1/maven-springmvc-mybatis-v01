package com.ballot.dao;

import java.util.List;

import com.ballot.entity.USER;

public interface USERMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(USER record);

    int insertSelective(USER record);

    USER selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(USER record);

    int updateByPrimaryKey(USER record);
    
    USER findUser(USER record);
    
    List<USER> findAllUser();
}