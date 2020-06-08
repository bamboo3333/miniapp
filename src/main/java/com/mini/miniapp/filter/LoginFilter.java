package com.mini.miniapp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author:guan
 * @2020/4/10 19:34
 * 文件信息：
 */
@WebFilter(filterName = "loginFilter",urlPatterns = {"*.jsp","*.action"})
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        /*拦截jsp页面*/
        HttpServletRequest request1 = (HttpServletRequest) request;
        String currentURL = request1.getRequestURI();
        HttpSession sessionuser = request1.getSession();
        //取到你存入httpsession中的数据
        String user = (String) sessionuser.getAttribute("usersession");
        //判断路径是否是/login.jsp或者/register.jsp如果是则放行继续执行
        if (("/jsp/login.jsp").equals(currentURL)||("/admin/login.action").equals(currentURL)) {
            chain.doFilter(request, response);
        } else if (!(user == null)) {//判断用户是否登录
            chain.doFilter(request, response);
        } else if (("/").equals(currentURL)) {//判断是否是第一次默认跳转页面
            chain.doFilter(request, response);
        } else {//如果以上情况都不是则跳回登录界面
            ((HttpServletResponse) response).sendRedirect("/jsp/login.jsp");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
