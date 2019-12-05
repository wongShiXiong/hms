package com.hms.entity;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果类
 * @author 王世雄
 *
 */

public class PageResult{
	
	private long total;//总条数
	private List rows;//当前页数据
	
	
	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	

}
