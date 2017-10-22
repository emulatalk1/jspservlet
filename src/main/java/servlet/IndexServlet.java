package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pr = resp.getWriter();
        String name = "";
        HttpSession httpSession = req.getSession();
        Object usernameHttpSession = httpSession.getAttribute("username");
        if (usernameHttpSession != null) {
            name = (String) usernameHttpSession;
        } else {
            resp.sendRedirect("/login");
        }
        pr.println("<h1> This is Index of </h1>" + name);
        pr.println("</br> Logout <a href = '/logout'> Logout </a>");
        pr.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
