package com.wrox;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jiangqin on 17/4/5.
 */
public class FilterA implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Entering FilterA.doFilter()");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Leaving FilterA.doFilter");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
