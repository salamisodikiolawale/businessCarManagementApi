package com.bcm.businesscarmanagementapi.filter;

import jakarta.servlet.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.logging.Logger;

import java.io.IOException;

public class AuthoritiesLoggingAfterFilter implements Filter {
    private final Logger LOG = Logger.getLogger(AuthoritiesLoggingAfterFilter.class.getName());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        Authentication authentication  = SecurityContextHolder.getContext().getAuthentication(); //SecurityContextHolder : contient des infos du user current
        if(authentication != null){
            LOG.info("User " + authentication.getName() + " is successfully authenticated and " +  " has the authorities " +  authentication.getAuthorities().toString());
        }

        chain.doFilter(request, response);
    }
}
