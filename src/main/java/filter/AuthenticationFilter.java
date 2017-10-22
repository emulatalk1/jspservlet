package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/index",})
public class AuthenticationFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Was in AuthenticationFilter");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        System.out.println(password);

        HttpSession httpSession = req.getSession();

        Object usernameInSession = httpSession.getAttribute("username");

        if (usernameInSession != null) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else  {
            if (username != null && password != null && username.equalsIgnoreCase("emulatalk1") && password.equals("abc123")) {
                httpSession.setAttribute("username", username);
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                resp.sendRedirect("/login");
            }
        }

    }

    public void destroy() {
    }
}
