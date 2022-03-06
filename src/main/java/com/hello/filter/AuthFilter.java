package com.hello.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AuthFilter extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        boolean isAuthenticated = true;

        System.out.println("in auth filter");

        if (isAuthenticated) {
            chain.doFilter(request, response);
        }
    }
}
