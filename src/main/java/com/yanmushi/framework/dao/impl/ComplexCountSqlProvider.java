/**
 * Create time 2014-5-16 上午11:36:47
 */
package com.yanmushi.framework.dao.impl;

/**
 * <p>Title: ComplexCountSqlProvider</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public class ComplexCountSqlProvider extends AbstractCountSqlProvider {

	@Override
	public String getCountSQL(String sql) {
		String usql = removeOrders(sql);
		return "select count(*) from (" + usql + ") as _rg_count";
	}

}
