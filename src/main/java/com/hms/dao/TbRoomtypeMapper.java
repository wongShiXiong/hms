package com.hms.dao;

import com.hms.pojo.TbRoomtype;
import com.hms.pojo.TbRoomtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoomtypeMapper {
    int countByExample(TbRoomtypeExample example);

    int deleteByExample(TbRoomtypeExample example);

    int deleteByPrimaryKey(Integer rpId);

    int insert(TbRoomtype record);

    int insertSelective(TbRoomtype record);

    List<TbRoomtype> selectByExample(TbRoomtypeExample example);

    TbRoomtype selectByPrimaryKey(Integer rpId);

    int updateByExampleSelective(@Param("record") TbRoomtype record, @Param("example") TbRoomtypeExample example);

    int updateByExample(@Param("record") TbRoomtype record, @Param("example") TbRoomtypeExample example);

    int updateByPrimaryKeySelective(TbRoomtype record);

    int updateByPrimaryKey(TbRoomtype record);
    
    List<TbRoomtype> findAllBystate();
}