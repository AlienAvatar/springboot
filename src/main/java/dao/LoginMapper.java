package dao;

import entity.Login;

public interface LoginMapper {
    int deleteByPrimaryKey(String pkid);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(String pkid);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}