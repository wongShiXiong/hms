package com.hms.dao;

import com.hms.pojo.TbCustomer;
import com.hms.pojo.TbCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCustomerMapper {
    int countByExample(TbCustomerExample example);

    int deleteByExample(TbCustomerExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TbCustomer record);

    int insertSelective(TbCustomer record);

    List<TbCustomer> selectByExample(TbCustomerExample example);

    TbCustomer selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByExample(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByPrimaryKeySelective(TbCustomer record);

    int updateByPrimaryKey(TbCustomer record);
}