package com.company.control;

import com.company.model.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
