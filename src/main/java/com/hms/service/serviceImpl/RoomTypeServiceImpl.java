package com.hms.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hms.dao.TbRoomtypeMapper;
import com.hms.entity.PageResult;


import com.hms.pojo.TbRoomtype;
import com.hms.pojo.TbRoomtypeExample;
import com.hms.pojo.TbRoomtypeExample.Criteria;
import com.hms.service.RoomTypeService;
@Service
public class RoomTypeServiceImpl implements RoomTypeService {
	@Autowired
	TbRoomtypeMapper roomTypeMapper;
	
	@Override
	public List<TbRoomtype> findAll() {
		return roomTypeMapper.selectByExample(null);
	}

	@Override
	public void add(TbRoomtype roomtype) {
		roomTypeMapper.insert(roomtype);
	}

	@Override
	public TbRoomtype findOne(int id) {
		return roomTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbRoomtype roomtype) {
		roomTypeMapper.updateByPrimaryKey(roomtype);
		
	}

	@Override
	public void delete(int[] ids) {
		for(Integer id:ids) {
			roomTypeMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<TbRoomtype> page = (Page<TbRoomtype>) roomTypeMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public PageResult findPage(TbRoomtype roomtype, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRoomtypeExample example = new TbRoomtypeExample();
		Criteria criteria = example.createCriteria();
		if(roomtype!=null) {
			if(roomtype.getRtName()!=null&&roomtype.getRtName().length()>0) {
				criteria.andRtNameLike("%"+roomtype.getRtName()+"%");
			}
			if(roomtype.getRtState()!=null&&roomtype.getRtState().length()>0) {
				criteria.andRtStateLike("%"+roomtype.getRtState()+"%");
			}
		}
		Page<TbRoomtype> page = (Page<TbRoomtype>) roomTypeMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}
	@Override
	public List<TbRoomtype> findAllBystate() {
	/*	System.out.println(roomTypeMapper.findAllBystate());*/
		return roomTypeMapper.findAllBystate();
	}

}
