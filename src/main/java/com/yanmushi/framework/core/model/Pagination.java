package com.yanmushi.framework.core.model;


public class Pagination {

	private long totalRows = -1;
	private int totalPages = 0;
	private int pageSize = 20;
	private int offset = 0;
	private int current = 1;
	
	private boolean init;
	
	public Pagination() {
	}

	public Pagination(int current, int pageSize) {
		this.current = current;
		this.pageSize = pageSize;
		this.offset = (current - 1) * pageSize;
	}
	
	public Pagination(long totalRows, int pageSize, int offset) {
		this.totalRows = totalRows;
		this.pageSize = pageSize;
		this.offset = offset;
		this.current = this.offset / this.pageSize + 1;
		countTotalPages();
	}
	
	private void countTotalPages() {
		if (totalRows == -1) throw new IllegalArgumentException("uncountable pagination!");
		this.totalPages = (int) this.totalRows / this.pageSize + (this.totalRows % this.pageSize == 0 ? 0 : 1);
		this.init = true;
	}

	public long getTotalRows() {
		if (!init) countTotalPages();
		return totalRows;
	}
	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	
	public boolean getHasNext() {
		if (!init) countTotalPages();
		return current < totalPages;
	}
	
	public boolean getHasPrev() {
		if (!init) countTotalPages();
		return current > 1;
	}
	
	@Override
	public String toString() {
		StringBuffer res = new StringBuffer();
		res.append(getClass().getName());
		res.append("[");
		res.append(current);
		res.append(",");
		res.append(pageSize);
		res.append(",");
		res.append(totalPages);
		res.append(",");
		res.append(totalRows);
		res.append("]");
		return res.toString();
	}
}
