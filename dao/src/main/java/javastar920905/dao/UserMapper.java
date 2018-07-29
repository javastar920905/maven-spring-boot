package javastar920905.dao;


import javastar920905.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ouzhx  on ${date}
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM CITY WHERE state = #{state}")
    User findByState(@Param("state") String state);

    @Select("SELECT * FROM user ")
    List<User> findList();




}
