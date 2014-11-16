package com.yanmushi.framework.dao.entity;

public class Goods {

	private Integer id;
	private String sn;
	private Integer store;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public Integer getStore() {
		return store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append("@");
		sb.append(id);
		sb.append("[");
		sb.append(sn);
		sb.append(",");
		sb.append(store);
		sb.append("]");
		return sb.toString();
	}
}
