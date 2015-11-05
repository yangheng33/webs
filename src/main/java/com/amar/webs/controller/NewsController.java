/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.controller;

import com.amar.webs.dao.NewsMapper;
import com.amar.webs.model.News;
import com.amar.webs.model.NewsExample;
import com.amar.webs.model.NewsExample.Criteria;
import com.amar.webs.model.SecUser;
import com.amar.webs.utils.DatetimeUtil;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Logger;
/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/news")
public class NewsController {
    
    private final Logger log = Logger.getLogger( this.getClass() );
    
    @Resource(name = "newsMapper")
    NewsMapper newsMapper;

    @RequestMapping(value = "/list")
    public String list(HttpServletRequest request, HttpServletResponse response) {

        String categroy = request.getParameter("categoryid");
        String status = request.getParameter("status");
        String starttime_begin = request.getParameter("starttime_begin");
        String starttime_end = request.getParameter("starttime_end");
        String title = request.getParameter("title");

        NewsExample newsExample = new NewsExample();
        Criteria criteria = newsExample.createCriteria();

        if (checkGreatZero(categroy)) {
            criteria.andCategoryidEqualTo(Integer.parseInt(categroy));
        }
        if (checkGreatZero(status)) {
            criteria.andStatusEqualTo(Integer.parseInt(status));
        }
        if (title != null && !"".equals(title)) {
            criteria.andTitleLike(title);
        }
        if (starttime_begin != null && starttime_begin.trim().length() > 0) {
            starttime_begin = starttime_begin + " 00:00:00";
            criteria.andStarttimeGreaterThan(DatetimeUtil.datetimeStringToDate(starttime_begin));
        }
        if (starttime_end != null && starttime_end.trim().length() > 0) {
            starttime_end = starttime_end + " 23:59:59";
            criteria.andStarttimeLessThan(DatetimeUtil.datetimeStringToDate(starttime_end));
        }
        newsExample.setOrderByClause("lastedittime desc");
        List<News> list = newsMapper.selectByExample(newsExample);

        request.setAttribute("newlist", list);
        return "/news/newslist";
    }

    public boolean checkGreatZero(String param) {
        boolean result = false;
        try {
            result = param != null && Integer.parseInt(param) > 0;
        } catch (Exception e) {
        }
        return result;
    }

    @RequestMapping(value = "/toadd")
    public String toAddNews(HttpServletRequest request, HttpServletResponse response) {
        return "/news/addnews";
    }

    @RequestMapping(value = "/add")
    public String addNews(HttpServletRequest request, HttpServletResponse response) {
        //String status = request.getParameter("status");
        String categroy = request.getParameter("categoryid");
        String content = request.getParameter("content");
        String title = request.getParameter("title");
        String sourceby = request.getParameter("sourceby");
        String titlepic = request.getParameter("titlepic");

        News news = new News();
        news.setCategoryid(Integer.parseInt(categroy));
        news.setTitle(title);
        news.setContent(content);
        news.setSourceby(sourceby);
        news.setTitlepic(titlepic);

        SecUser user = (SecUser) request.getSession().getAttribute("user");
        news.setEditorid(user.getId());
        newsMapper.insert(news);
        return "/news/newlist";
    }

    @RequestMapping(value = "/del")
    public void delNews(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/edit")
    public String editNews(HttpServletRequest request, HttpServletResponse response) {

        String status = request.getParameter("status");
        String categroy = request.getParameter("categoryid");
        String content = request.getParameter("content");
        String title = request.getParameter("title");
        String sourceby = request.getParameter("sourceby");
        String titlepic = request.getParameter("titlepic");
        String id = request.getParameter("id");

        News news = new News();
        news.setId(Integer.parseInt(id));
        news.setCategoryid(Integer.parseInt(categroy));
        news.setTitle(title);
        news.setContent(content);
        news.setSourceby(sourceby);
        news.setTitlepic(titlepic);

        newsMapper.updateByPrimaryKeySelective(news);

        return "/news/editnews";
    }
}
