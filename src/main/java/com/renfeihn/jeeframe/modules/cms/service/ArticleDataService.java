package com.renfeihn.jeeframe.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.renfeihn.jeeframe.common.service.CrudService;
import com.renfeihn.jeeframe.modules.cms.dao.ArticleDataDao;
import com.renfeihn.jeeframe.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author renfei
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
