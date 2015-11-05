/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.interceptor;

import com.amar.webs.model.SecUser;
import java.util.Enumeration;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author Administrator
 */
public class NeedLoginIntercepter implements HandlerInterceptor {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
        log.debug("afterCompletion");
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {
        log.debug("postHandle");
    }

    public boolean validateRight(String url, SecUser user) {
        boolean result = true;

        String forbiddenUrl[] = {"diaryJob.amar", "jobPlan.amar"};
        for (String fbUrl : forbiddenUrl) {
            if (user == null && url.contains(fbUrl)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public boolean validate(String data) {
        boolean result = true;

        String forbiddens[] = {"drop", "select"};
        if (data != null && !"".equals(data.trim())) {
            for (String forbidden : forbiddens) {
                if (data.toLowerCase().contains(forbidden)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        boolean result = true;
        log.debug("preHandle");
//        Enumeration names = arg0.getParameterNames();
//        while (names.hasMoreElements()) {
//            String name = names.nextElement().toString();
//            String value = arg0.getParameter(name.toString());
//            if (!validate(value)) {
//                result = false;
//                //arg1.sendRedirect("error.amar?method=toWarning");
//                arg1.sendRedirect("/user/tologin");
//                break;
//            }
//        }
        String url = arg0.getRequestURI();
        SecUser user = (SecUser) arg0.getSession().getAttribute("user");
        if (user == null && (!url.contains("/user/tologin") && !url.contains("user/login"))) {
            log.debug("需要登录");
            arg1.sendRedirect(arg0.getContextPath()+"/user/tologin");
            result = false;
        }

        return result;
    }

}
