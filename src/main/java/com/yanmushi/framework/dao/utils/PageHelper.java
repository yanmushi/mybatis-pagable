/**
 * Create time 2014-4-15 下午2:58:49
 */
package com.yanmushi.framework.dao.utils;

import org.apache.ibatis.session.RowBounds;

/**
 * <p>Title: PageHelper</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public class PageHelper {

	/**
	 * 通过当前页面和加载数据数目，计算当前读取数据的LIMIT
	 * @param current
	 * @param pagesize
	 * @return
	 */
	public static RowBounds createRowBounds(int current, int pagesize) {
		if (current < 1) 
			throw new IllegalArgumentException("The parameter current is wrong!");
		return new RowBounds((current-1)*pagesize, pagesize);
	}
}
