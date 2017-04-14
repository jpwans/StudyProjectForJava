package com.wrox;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by jiangqin on 17/4/5.
 */
@WebListener
public class Configurator implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();

//        FilterRegistration.Dynamic registration = context.addFilter("requestLogFilter",new RequestLogFilter());
//        registration.addMappingForUrlPatterns(null,false,"/*");
//        registration = context.addFilter("compressionFilter", new CompressionFilter());、
//


        FilterRegistration.Dynamic registration = context.addFilter("authenticationFilter",new AuthenticationFilter());

        registration.setAsyncSupported(true);
        registration.addMappingForUrlPatterns(null, false, "/sessions","/tickets");
//        registration.addMappingForUrlPatterns(null,false,"/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
