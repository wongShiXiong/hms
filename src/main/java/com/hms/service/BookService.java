package com.hms.service;

import java.util.List;

import com.hms.entity.PageResult;
import com.hms.pojo.TbBookroom;
import com.hms.pojo.TbRoomtype;



public interface BookService {

	public List<TbBookroom> findAll();
	
/*	public void updateTwo(DisBook disBook);*/
	
	public void updateByRtId(int rt_id);
	
	public void updateBycId(int c_id);
	
	public void updateTwo(int rt_id,int c_id,int a_id);
	/**
	 * 查找一条数据
	 * @param id
	 * @return
	 */
	public TbBookroom findOne(int id);
	
	/**
	 * 增加
	 * @return
	 */
	public void add(TbBookroom bookroom);
	/**
	 * 更新
	 * @param customer
	 */
	public void update(TbBookroom bookroom);
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
	public PageResult findPage(TbBookroom bookroom,int pageNum,int pageSize);
	/**
	 * 更改客房状态
	 */
	public void updateRoomState(int rt_id);
	
	/**
	 * 根据主键更新退宿状态
	 */
	public void updateRetirementById(int a_id);
	
	
	
	
	
	
}
