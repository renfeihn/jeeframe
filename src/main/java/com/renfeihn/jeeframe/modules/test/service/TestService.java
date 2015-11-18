
package com.renfeihn.jeeframe.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renfeihn.jeeframe.common.service.CrudService;
import com.renfeihn.jeeframe.modules.test.entity.Test;
import com.renfeihn.jeeframe.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author renfei
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
