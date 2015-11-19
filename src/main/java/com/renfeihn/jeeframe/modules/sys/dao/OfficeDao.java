package com.renfeihn.jeeframe.modules.sys.dao;

import com.renfeihn.jeeframe.common.persistence.TreeDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author renfei
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
