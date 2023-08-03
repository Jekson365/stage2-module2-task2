package com.example.listener;

import java.time.LocalDateTime;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        LocalDateTime servletTimeInit = LocalDateTime.now();
        servletContext.setAttribute("servletTimeInit", servletTimeInit);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // Cleanup code, if needed.
    }
}
