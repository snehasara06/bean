package com.kgisl.springBeanPractice;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    {
        System.out.println("********** AppInitializer Loaded ********** ");
    }

    @Override
    
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppContext.class };
    }

    @Override
    
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/","/books","/books/name" };
    }

}