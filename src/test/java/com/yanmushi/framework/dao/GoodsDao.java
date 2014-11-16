package com.yanmushi.framework.dao;

import org.apache.ibatis.session.RowBounds;


import com.yanmushi.framework.dao.entity.Goods;
import com.yanmushi.framework.dao.mybaties.model.PageResult;

/**
 * <p>Title: GoodsDao</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
public interface GoodsDao {

	public int countAll();
	
	public PageResult<Goods> page(RowBounds rowBounds);
	
}
