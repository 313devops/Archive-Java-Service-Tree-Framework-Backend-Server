/*
 * @author Dongmin.lee
 * @since 2022-06-19
 * @version 22.06.19
 * @see <pre>
 *  Copyright (C) 2007 by 313 DEV GRP, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by 313 developer group <313@313.co.kr>, December 2010
 * </pre>
 */
package egovframework.api.arms.module_analcrawler.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import egovframework.com.ext.jstree.springHibernate.core.controller.SHVAbstractController;

import egovframework.api.arms.module_analcrawler.model.AnalCrawlerDTO;
import egovframework.api.arms.module_analcrawler.service.AnalCrawler;

@Slf4j
@Controller
@RequestMapping(value = {"/auth-anon/api/arms/analcrawler"})
public class AnonAnalCrawlerController extends SHVAbstractController<AnalCrawler, AnalCrawlerDTO> {

    @Autowired
    @Qualifier("analCrawler")
    private AnalCrawler analCrawler;

    @PostConstruct
    public void initialize() {
        setJsTreeHibernateService(analCrawler);
    }

}