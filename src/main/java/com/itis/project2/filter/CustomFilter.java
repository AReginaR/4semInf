 package com.itis.project2.filter;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
//
//@Component
//public class CustomFilter extends GenericFilterBean {
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        String agent = httpServletRequest.getHeader("User-Agent");
//        if(agent.contains("Microsoft Edge")){
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            throw new IllegalArgumentException();
//        }
//    }
//}
