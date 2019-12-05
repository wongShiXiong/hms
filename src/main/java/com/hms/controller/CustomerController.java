package com.hms.controller;

import com.hms.entity.PageResult;
import com.hms.entity.Result;
import com.hms.pojo.TbCustomer;
import com.hms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/findAll")
	public List<TbCustomer> findAll(){
		return customerService.findAll();
	}

	@RequestMapping("/add")
	public Result add(@RequestBody TbCustomer customer) {
		try {
			customerService.add(customer);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
		
	}
	
	@RequestMapping("/findOne")
	public TbCustomer findOne(int id) {
		return customerService.findOne(id);
	}
	
	@RequestMapping("/update")
	public Result update(@RequestBody TbCustomer customer) {
		try {
			customerService.update(customer);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
		
	}
	
	@RequestMapping("/delete")
	public Result delete(int[] ids) {
		try {
			customerService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
		
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int size) {
		//size总记录数
		return customerService.findPage(page, size);
	}
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbCustomer customer,int page,int size) {
		return customerService.findPage(customer, page, size);
	}
		
			
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

