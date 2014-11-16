/**
 * Create time 2014-5-16 上午11:39:03
 */
package com.yanmushi.framework.dao.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yanmushi.framework.dao.CountSqlProvider;


/**
 * <p>Title: AbstractCountSqlProvider</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public abstract class AbstractCountSqlProvider implements CountSqlProvider {

	protected String removeOrders(String sql) {
		Pattern p = Pattern.compile("ORDER\\s*by[\\w|\\W|\\s|\\S]*", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(sql);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "");
		}
		m.appendTail(sb);
		return sb.toString();
	}
}
