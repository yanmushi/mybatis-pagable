/**
 * Create time 2014-4-23 下午2:12:17
 */
package com.yanmushi.framework.core.model;

import java.util.List;

/**
 * <p>Title: PageData</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 * @param <T>
 */
public class PageData<T> implements Pageable<T> {

	protected Pagination pagination;
	protected List<T> datas;

	public PageData() {
	}
	
	/**
	 * @param pagination
	 * @param datas
	 */
	public PageData(Pagination pagination, List<T> datas) {
		super();
		this.pagination = pagination;
		this.datas = datas;
	}
	
	@Override
	public Pagination getPagination() {
		return pagination;
	}

	@Override
	public List<T> getDatas() {
		return datas;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

}
