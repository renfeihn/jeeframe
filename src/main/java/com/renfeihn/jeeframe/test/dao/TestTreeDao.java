
package com.renfeihn.jeeframe.test.dao;

import com.renfeihn.jeeframe.common.persistence.TreeDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author renfei
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}