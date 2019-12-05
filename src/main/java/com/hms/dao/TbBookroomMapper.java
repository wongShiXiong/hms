package com.hms.dao;

import com.hms.pojo.TbBookroom;
import com.hms.pojo.TbBookroomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBookroomMapper {
    int countByExample(TbBookroomExample example);



    int deleteByExample(TbBookroomExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(TbBookroom record);

    int insertSelective(TbBookroom record);

    List<TbBookroom> selectByExample(TbBookroomExample example);

    TbBookroom selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") TbBookroom record, @Param("example") TbBookroomExample example);

    int updateByExample(@Param("record") TbBookroom record, @Param("example") TbBookroomExample example);

    int updateByPrimaryKeySelective(TbBookroom record);

    int updateByPrimaryKey(TbBookroom record);
    
    void updateByRtId(int rt_id);
    
    void updateBycId(int c_id);
    
    void updateStateByRtId(int rt_id);
    
    void updateRetirementById(int a_id);
    
   
    
    
    
}