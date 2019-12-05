package com.hms.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hms.dao.TbCustomerMapper;
import com.hms.entity.PageResult;
import com.hms.pojo.TbCustomer;
import com.hms.pojo.TbCustomerExample;
import com.hms.pojo.TbCustomerExample.Criteria;
import com.hms.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	TbCustomerMapper customerMapper;
	@Override
	public List<TbCustomer> findAll() {
		return customerMapper.selectByExample(null);
	}
	@Override
	public void add(TbCustomer customer) {
		customerMapper.insert(customer);
	}
	@Override
	public TbCustomer findOne(int id) {
		return customerMapper.selectByPrimaryKey(id);
	}
	@Override
	public void update(TbCustomer customer) {
		customerMapper.updateByPrimaryKey(customer);
	}
	@Override
	public void delete(int[] ids) {
		for(Integer id:ids) {
			customerMapper.deleteByPrimaryKey(id);
		}
	}
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		//mybatis分页
		PageHelper.startPage(pageNum, pageSize);
		
		Page<TbCustomer> page = (Page<TbCustomer>) customerMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(), page.getResult());
	}
	@Override
	public PageResult findPage(TbCustomer customer, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCustomerExample example = new TbCustomerExample();
		
		Criteria criteria = example.createCriteria();
		if(customer!=null) {
			if(customer.getcName()!=null&&customer.getcName().length()>0) {
				criteria.andCNameLike("%"+customer.getcName()+"%");
			}
			if(customer.getcType()!=null&&customer.getcType().length()>0) {
				criteria.andCTypeLike("%"+customer.getcType()+"%");
			}
			if(customer.getcState()!=null&&customer.getcState().length()>0) {
				criteria.andCStateLike("%"+customer.getcState()+"%");
			}
		}
		Page<TbCustomer> page = (Page<TbCustomer>) customerMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

}
