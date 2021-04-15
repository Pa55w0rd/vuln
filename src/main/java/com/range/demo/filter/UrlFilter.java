package com.range.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "*.action",filterName = "urlfilter")
public class UrlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UrlFilter init");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(" enter UrlFilter  ");
        //具体拦截方式
        HttpServletRequest uri=(HttpServletRequest) request;
        String requestUri=uri.getRequestURI();//用户路径
        String servletPath=uri.getServletPath();//实际路径
        String getPathInfo=uri.getPathInfo();
        System.out.println("getRequestURI: "+requestUri);
        System.out.println("getServletPath: "+servletPath);
        System.out.println("getPathInfo: "+getPathInfo);
        if(requestUri.startsWith("/filter/admin")&&requestUri.endsWith(".action")){
            //Auth 鉴权函数，这里省略
            System.out.println("UrlFilter Need Auth ");
            return;
        }

        System.out.println("UrlFilter by pass ");

        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        System.out.println("UrlFilter init");
    }
}
