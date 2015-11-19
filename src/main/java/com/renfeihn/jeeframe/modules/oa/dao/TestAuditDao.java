package com.renfeihn.jeeframe.modules.oa.dao;

import com.renfeihn.jeeframe.common.persistence.CrudDao;
import com.renfeihn.jeeframe.common.persistence.annotation.MyBatisDao;
import com.renfeihn.jeeframe.modules.oa.entity.TestAudit;

/**
 * 审批DAO接口
 * @author renfei
 * @version 2014-05-16
 */
@MyBatisDao
public interface TestAuditDao extends CrudDao<TestAudit> {

	public TestAudit getByProcInsId(String procInsId);
	
	public int updateInsId(TestAudit testAudit);
	
	public int updateHrText(TestAudit testAudit);
	
	public int updateLeadText(TestAudit testAudit);
	
	public int updateMainLeadText(TestAudit testAudit);
	
}
