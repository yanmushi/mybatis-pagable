package com.yanmushi.framework.core.model;

import java.util.List;

public interface Pageable<T> {

	Pagination getPagination();
	
	List<T> getDatas();
}
