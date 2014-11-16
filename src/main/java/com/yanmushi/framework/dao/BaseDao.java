package com.yanmushi.framework.dao;

import java.util.List;

public interface BaseDao<T, PK> {
	
	/**
	 * @Description   根据ID查找
	 * @Author        xinglintuo
	 * @Date          2014-4-15
	 */
	public T findByID(PK pk);
	
	/**
	 * @Description   条件查找
	 * @Author        xinglintuo
	 * @Date          2014-4-15
	 */
	public List<T> findByCondition(T obj);
	
	/**
	 * @Description   插入
	 * @Author        xinglintuo
	 * @Date          2014-4-15
	 */
	public void insert(T obj);
	
	/**
	 * @Description   更新
	 * @Author        xinglintuo
	 * @Date          2014-4-15
	 */
	public void update(T obj);
	
	/**
	 * @Description   根据ID删除
	 * @Author        xinglintuo
	 * @Date          2014-4-15
	 */
	public void delete(PK pk);
}
