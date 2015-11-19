package com.renfeihn.jeeframe.test.dao;

import com.renfeihn.jeeframe.common.persistence.CrudDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.test.entity.TestData;

/**
 * 单表生成DAO接口
 * @author renfei
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
}