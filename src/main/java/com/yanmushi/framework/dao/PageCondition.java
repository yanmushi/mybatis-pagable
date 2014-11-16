/**
 * Create time 2014-4-15 下午2:25:38
 */
package com.yanmushi.framework.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: PageCondition</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public class PageCondition {

	public static class OrderModel {
		/** The order direction: asc */
		public static final String ORDER_ASC = "ASC";
		/** The order direction: desc */
		public static final String ORDER_DESC = "DESC";
		
		private String orderBy;
		private String orderDir;

		public OrderModel(String orderBy, String orderDir) {
			this.orderBy = orderBy;
			this.orderDir = orderDir;
		}
		
		public OrderModel(String orderBy) {
			this(orderBy, ORDER_ASC);
		}
		
		/**
		 * @return Returns the orderBy.
		 */
		public String getOrderBy() {
			return orderBy;
		}
		/**
		 * @param orderBy The orderBy to set.
		 */
		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}
		/**
		 * @return Returns the orderDir.
		 */
		public String getOrderDir() {
			return orderDir;
		}
		/**
		 * @param orderDir The orderDir to set.
		 */
		public void setOrderDir(String orderDir) {
			this.orderDir = orderDir;
		}
		
	}
	
	private int current;
	private int offset;
	private int pageSize;
	private List<OrderModel> orderModels = new ArrayList<PageCondition.OrderModel>(0);

	/**
	 * @param current
	 * @param pageSize
	 */
	public PageCondition(int current, int pageSize) {
		super();
		if (current < 1) throw new IllegalArgumentException("the current page is wrong!");
		this.current = current;
		this.pageSize = pageSize;
		this.offset = (current - 1) * pageSize;
	}

	public PageCondition addOrderModel(String orderBy) {
		return addOrderModel(new OrderModel(orderBy));
	}
	
	public PageCondition addOrderModel(String orderBy, String orderDir) {
		return addOrderModel(new OrderModel(orderBy, orderDir));
	}

	public PageCondition addOrderModel(OrderModel model) {
		orderModels.add(model);
		return this;
	}
	
	/**
	 * @return Returns the current.
	 */
	public int getCurrent() {
		return current;
	}
	/**
	 * @param current The current to set.
	 */
	public void setCurrent(int current) {
		this.current = current;
	}
	/**
	 * @return Returns the pageSize.
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize The pageSize to set.
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * @return Returns the orderModels.
	 */
	public List<OrderModel> getOrderModels() {
		return orderModels;
	}

	/**
	 * @return Returns the offset.
	 */
	public int getOffset() {
		return offset;
	}
	
}
