package com.renfeihn.jeeframe.modules.gen.dao;

import com.renfeihn.jeeframe.common.persistence.CrudDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.modules.gen.entity.GenScheme;

/**
 * 生成方案DAO接口
 * @author renfei
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenSchemeDao extends CrudDao<GenScheme> {
	
}
