/**
 * Create time 2014-4-15 下午2:14:13
 */
package com.yanmushi.framework.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.yanmushi.framework.dao.entity.Goods;
import com.yanmushi.framework.dao.mybaties.model.PageResult;
import com.yanmushi.framework.dao.utils.PageHelper;


/**
 * <p>Title: DaoTest</p>
 * <p>Description: </p>
 *
 * @author YinLei
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class DaoTest {

	@Resource GoodsDao goodsDao;
	
	@Test
	public void test() {
		RowBounds row = PageHelper.createRowBounds(1, 10);
		PageResult<Goods> page = null;
		page = goodsDao.page(row);
		System.out.println(page.getPagination());
		System.out.println(page.getDatas());
	}
}
