package com.hms.service;

import java.util.List;

import com.hms.entity.PageResult;
import com.hms.pojo.TbCustomer;

public interface CustomerService {
	/**
	 * 查找所有顾客信息
	 * @return
	 */
	public List<TbCustomer> findAll();
	/**
	 * 增加
	 * @return
	 */
	public void add(TbCustomer customer);
	/**
	 * 查找一条信息
	 * @return
	 */
	public TbCustomer findOne(int id);
	/**
	 * 更新
	 * @param customer
	 */
	public void update(TbCustomer customer);
	/**
	 * 
	 * @param ids
	 */
	public void delete(int[] ids);
	/**
	 * 分页
	 * @param pageNum 第几页
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	/**
	 * 分页条件查询
	 * @param customer
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(TbCustomer customer,int pageNum,int pageSize);
	
	
	
	
	
	
}
