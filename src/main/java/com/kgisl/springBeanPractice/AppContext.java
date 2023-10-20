package com.kgisl.springBeanPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
@ComponentScan(basePackages = "com.kgisl.springBeanPractice")
public class AppContext {
    {
        System.out.println("********** AppContext Loaded ********** ");
    }

    @Bean
    // @Scope("singleton")
    @Scope("prototype")

// WEB AWARE SCOPES- Request, Session, Application, Websocket

    // @ApplicationScope
    // @RequestScope
    // @SessionScope
    // @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode =
    // ScopedProxyMode.TARGET_CLASS)
    public Book book() {
        return new Book();
    }

}
