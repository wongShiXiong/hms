package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;import com.hms.dao.TbRoomtypeMapper;
import com.hms.entity.PageResult;
import com.hms.entity.Result;
import com.hms.pojo.TbCustomer;
import com.hms.pojo.TbRoomtype;
import com.hms.service.RoomTypeService;

@ResponseBody
@Controller
@RequestMapping("/roomType")
public class RoomTypeController {
	@Autowired
	RoomTypeService roomTypeService;
	@RequestMapping("/findAll")
	public List<TbRoomtype> findAll(){
		return roomTypeService.findAll();
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbRoomtype roomtype) {
		try {
			roomTypeService.add(roomtype);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
		
	}
	
	@RequestMapping("/findOne")
	public TbRoomtype findOne(int id) {
		return roomTypeService.findOne(id);
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbRoomtype roomtype) {
		try {
			roomTypeService.update(roomtype);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
		
	}

	@RequestMapping("/delete")
	public Result delete(int[] ids) {
		try {
			roomTypeService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
		
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int size) {
		//size总记录数
		return roomTypeService.findPage(page, size);
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbRoomtype roomtype,int page,int size) {
		return roomTypeService.findPage(roomtype, page, size);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
