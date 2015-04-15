package com.zh.web.service;

import java.util.List;
import com.zh.core.model.Pager;
import com.zh.web.model.bean.BomPrimary;

/**
 * 
* @Title: ProductStructureService.java 
* @Package com.zh.base.service 
* @Description: 产品结构清单接口
* @date 2015年3月25日 下午7:41:39 
* @author taozhaoping 26078
* @author mail taozhaoping@gmail.com
* @version V1.0
 */
public interface ProductStructService {

	/**
	 * 查询信息
	 * @param 
	 * @return
	 */
	public BomPrimary queryPrimary(BomPrimary bomPrimary);
	
	/**
	 * 修改
	 * @param 
	 */
	public void updatePrimary(BomPrimary bomPrimary);
	
	/**
	 * 查询列表
	 * @param 
	 * @return
	 */
	public List<BomPrimary> queryPrimaryList(BomPrimary bomPrimary);
	
	/**
	 * 查询列表，带分页
	 * @param 
	 * @return
	 */
	public List<BomPrimary> queryPrimaryList(BomPrimary bomPrimary , Pager page);
	
	/**
	 * 查询数量
	 * @param 
	 * @return
	 */
	public Integer countPrimary(BomPrimary bomPrimary);
	
	/**
	 * 删除
	 * @param 
	 */
	public void deletePrimary(BomPrimary bomPrimary);
	
	/**
	 * 新增
	 * @param 
	 */
	public Integer insertPrimary(BomPrimary bomPrimary);
}
