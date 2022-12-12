/*
 * @author Dongmin.lee
 * @since 2022-12-02
 * @version 22.12.02
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package egovframework.api.arms.module_armsscheduler.service;

import egovframework.com.ext.jstree.springHibernate.core.service.JsTreeHibernateService;

public interface ArmsScheduler extends JsTreeHibernateService {

    public void set_jiraProject_toPdServiceJira() throws Exception;
    public void set_PdServiceVersion_toJiraProjectVersion() throws Exception;
    public void set_jiraPriority_toPdServiceJiraPriority() throws Exception;

}