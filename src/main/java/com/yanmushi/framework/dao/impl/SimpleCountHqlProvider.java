package com.yanmushi.framework.dao.impl;


/**
 * <p>Title: SimpleCountHqlProvider</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public class SimpleCountHqlProvider extends AbstractCountSqlProvider {

	@Override
	public String getCountSQL(String sql) {
		String countHql = " SELECT count(*) "
				+ removeSelect(removeOrders(sql));

		return countHql;
	}

	// 去除sql语句中select子句
	private static String removeSelect(String hql) {
		int beginPos = hql.toLowerCase().indexOf("from");
		if (beginPos < 0) {
			throw new IllegalArgumentException(" hql : " + hql + " must has a keyword 'from'");
		}
		return hql.substring(beginPos);
	}

}
