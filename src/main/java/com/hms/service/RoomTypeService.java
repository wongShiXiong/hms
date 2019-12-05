package com.hms.service;

import java.util.List;

import com.hms.entity.PageResult;
import com.hms.pojo.TbRoomtype;

public interface RoomTypeService {
	

	public List<TbRoomtype> findAll();

	public void add(TbRoomtype roomtype);

	public TbRoomtype findOne(int id);
	
	public void update(TbRoomtype roomtype);
	
	public void delete(int[] ids);

	public PageResult findPage(int pageNum,int pageSize);

	public PageResult findPage(TbRoomtype roomtype,int pageNum,int pageSize);

	public List<TbRoomtype> findAllBystate();
}
