package com.yanmushi.framework.dao.mybaties;

import org.apache.ibatis.executor.Executor;

public interface ExecutorProvider {

	/**
	 * 是否支持当前拦截的对象信息
	 */
	boolean isSupport(Object o);

	/**
	 * 创建对应处理的执行器
	 */
	Executor create(Executor o);
}
