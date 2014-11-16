package com.yanmushi.framework.dao.mybaties.impl;

import org.apache.ibatis.executor.Executor;

import com.yanmushi.framework.dao.CountSqlProvider;
import com.yanmushi.framework.dao.impl.ComplexCountSqlProvider;
import com.yanmushi.framework.dao.mybaties.ExecutorProvider;
import com.yanmushi.framework.dao.mybaties.PaginationExecutor;


public class SimpleExecutorProvider implements ExecutorProvider {

	private String pattern = "^.*page.*$";
	private CountSqlProvider countSqlProvider = new ComplexCountSqlProvider();
	
	@Override
	public boolean isSupport(Object o) {
		return Executor.class.isAssignableFrom(o.getClass());
	}

	@Override
	public Executor create(Executor o) {
		return new PaginationExecutor(o, countSqlProvider, pattern);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public CountSqlProvider getCountSqlProvider() {
		return countSqlProvider;
	}

	public void setCountSqlProvider(CountSqlProvider countSqlProvider) {
		this.countSqlProvider = countSqlProvider;
	}

}
