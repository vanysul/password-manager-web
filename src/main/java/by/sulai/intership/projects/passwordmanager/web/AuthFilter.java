package by.sulai.intership.projects.passwordmanager.web;
import jakarta.servlet.http  .HttpServletRequest;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/*")
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;


        String authHeader = httpRequest.getHeader("AUTH");
        if (authHeader == null || !authHeader.equals("Иван")) {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized: Invalid AUTH header");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Очистка ресурсов
    }

}
