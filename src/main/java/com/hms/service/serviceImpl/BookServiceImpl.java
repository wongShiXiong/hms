package com.hms.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hms.dao.TbBookroomMapper;
import com.hms.dao.TbRoomtypeMapper;
import com.hms.entity.PageResult;
import com.hms.pojo.TbBookroom;
import com.hms.pojo.TbBookroomExample;
import com.hms.pojo.TbBookroomExample.Criteria;
import com.hms.pojo.TbRoomtype;
import com.hms.pojo.TbRoomtypeExample;
import com.hms.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	@Autowired()
	TbBookroomMapper bookMapper;
	
	@Override
	public List<TbBookroom> findAll() {
		return bookMapper.selectByExample(null);
	}

	@Override
	public void updateByRtId(int rt_id) {
		bookMapper.updateByRtId(rt_id);
		
	}

	@Override
	public TbBookroom findOne(int id) {
		return bookMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateBycId(int c_id) {
		bookMapper.updateBycId(c_id);
	}
/**
 * 退宿更新数据
 */
	@Override
	public void updateTwo(int rt_id, int c_id,int a_id) {
		bookMapper.updateByRtId(rt_id);
		bookMapper.updateBycId(c_id);
		bookMapper.updateRetirementById(a_id);
	}
	
	@Autowired
	TbRoomtypeMapper roomtypeMapper;

	@Override
	public void add(TbBookroom bookroom) {
		TbRoomtypeExample example = new TbRoomtypeExample();
		com.hms.pojo.TbRoomtypeExample.Criteria criteria = example.createCriteria();
		criteria.andRtIdEqualTo(bookroom.getaRoomid());
		List<TbRoomtype> list = roomtypeMapper.selectByExample(example);
		TbRoomtype roomtype = list.get(0);
		if(bookroom.getaType().equals("vip")) {
			if(roomtype.getRtName().equals("普通大床房")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*200);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*140);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
			if(roomtype.getRtName().equals("豪华大床房")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*300);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*210);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
			if(roomtype.getRtName().equals("标准间")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*200);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*140);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
			
		}else
		{
			if(roomtype.getRtName().equals("普通大床房")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*200);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*200);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
			if(roomtype.getRtName().equals("豪华大床房")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*300);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*300);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
			if(roomtype.getRtName().equals("标准间")) {
				//实际金额
				Integer actualvalue=(bookroom.getaBookdays()*200);
				bookroom.setaActualvalue(actualvalue.toString());
				//打折后
				Integer Shouquvalue=(bookroom.getaBookdays()*200);
				/*String shouquvalue=(bookroom.getaBookdays()*200*(7/10))+"";*/
				bookroom.setaShouquvalue(Shouquvalue.toString());
			}
		}

		bookMapper.insert(bookroom);
		
	}

	@Override
	public void update(TbBookroom bookroom) {
		bookMapper.updateByPrimaryKey(bookroom);
		
	}

	@Override
	public void delete(int[] ids) {
		for(Integer id:ids) {
			bookMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		//mybatis分页
		PageHelper.startPage(pageNum, pageSize);
		
		Page<TbBookroom> page = (Page<TbBookroom>) bookMapper.selectByExample(null);
		
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public PageResult findPage(TbBookroom bookroom, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbBookroomExample example = new TbBookroomExample();
		
		Criteria criteria = example.createCriteria();
		if(bookroom!=null) {
			if(bookroom.getaRoomid()!=null) {
				criteria.andARoomidEqualTo(bookroom.getaRoomid());/*("%"+bookroom.getaRoomid()+"%");*/
			}
			if(bookroom.getaCustomername()!=null&&bookroom.getaCustomername().length()>0) {
				criteria.andACustomernameLike("%"+bookroom.getaCustomername()+"%");
			}
			if(bookroom.getaValuestate()!=null&&bookroom.getaValuestate().length()>0) {
				criteria.andAValuestateLike("%"+bookroom.getaValuestate()+"%");
			}
			if(bookroom.getaRetirement()!=null&&bookroom.getaRetirement().length()>0) {
				criteria.andARetirementLike("%"+bookroom.getaRetirement()+"%");
			}
		}
		Page<TbBookroom> page = (Page<TbBookroom>) bookMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void updateRoomState(int rt_id) {
		bookMapper.updateStateByRtId(rt_id);
	}

	@Override
	public void updateRetirementById(int a_id) {
		bookMapper.updateRetirementById(a_id);
	}


	
	



}
