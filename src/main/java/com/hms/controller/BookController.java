package com.hms.controller;

import com.hms.entity.PageResult;
import com.hms.entity.Result;
import com.hms.pojo.TbBookroom;
import com.hms.pojo.TbRoomtype;
import com.hms.service.BookService;
import com.hms.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
@Controller
@RequestMapping("/book")
public class BookController {
	/*Test3*/
	@Autowired() 
	BookService bookService;
	
	@RequestMapping("/findAll")
	public List<TbBookroom> findAll(){
		return bookService.findAll();
	}
/*	@RequestMapping("/updateTwo")
	public Result add(@RequestBody DisBook disBook) {
		try {
			bookService.updateTwo(disBook);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
		
	}*/
	
	@RequestMapping("/updateTwo")
	public Result updateTwo(int rt_id, int c_id,int a_id) {
		try {
			bookService.updateTwo(rt_id,c_id,a_id);
			return new Result(true, "退宿成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "退宿失败");
		}
	}
	@RequestMapping("/add")
	public Result add(@RequestBody TbBookroom bookroom) {
		try {
			Integer rt_id = bookroom.getaRoomid();
			bookService.updateRoomState(rt_id);
			bookService.add(bookroom);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
		
	}
	@RequestMapping("/findOne")
	public TbBookroom findOne(int id) {
		return bookService.findOne(id);
	}
	@RequestMapping("/update")
	public Result update(@RequestBody TbBookroom bookroom) {
		try {
			bookService.update(bookroom);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
		
	}
	@RequestMapping("/delete")
	public Result delete(int[] ids) {
		try {
			bookService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
		
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int size) {
		//size总记录数
		return bookService.findPage(page, size);
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbBookroom bookroom,int page,int size) {
		return bookService.findPage(bookroom, page, size);
	}
	
	@Autowired
	RoomTypeService roomTypeService;
	
	@RequestMapping("/findAllBystate")
	public List<TbRoomtype> findAllBystate(){
		return roomTypeService.findAllBystate();
	}
	
}
