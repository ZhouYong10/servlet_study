package com.study.filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterLog implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("FilterLog 过滤器执行了，站点网址是：http://www.demo.com");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String site = config.getInitParameter("site");
        System.out.println("网站的名称：" + site);
    }

}
