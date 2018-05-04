package com.prototype.filter;

import com.prototype.model.entity.Audience;
import com.prototype.util.JwtHelper;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.GenericFilterBean;

import javax.security.auth.login.LoginException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtFilter extends GenericFilterBean {

    @Autowired
    private Audience audience;


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        //等到请求头信息authorization信息
        final String authHeader = request.getHeader("authorization");

        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            filterChain.doFilter(servletRequest, servletResponse);
        } else {

            if (authHeader == null || !authHeader.startsWith("bearer;")) {
                try {
                    throw new LoginException("登录异常");
                } catch (LoginException e) {
                    e.printStackTrace();
                }
            }
            final String token = authHeader.substring(7);

            try {
                if(audience == null){
                    BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
                    audience = (Audience) factory.getBean("audience");
                }
                final Claims claims = JwtHelper.parseJWT(token,audience.getBase64Secret());
                if(claims == null){
                    throw new LoginException("登录异常");
                }
                request.setAttribute("claims", claims);
            } catch (final Exception e) {
                try {
                    throw new LoginException("登录异常");
                } catch (LoginException e1) {
                    e1.printStackTrace();
                }
            }

            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
