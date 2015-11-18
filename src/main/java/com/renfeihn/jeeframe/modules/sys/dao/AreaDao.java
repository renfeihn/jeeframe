
package com.renfeihn.jeeframe.modules.sys.dao;

import com.renfeihn.jeeframe.common.persistence.TreeDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author renfei
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
