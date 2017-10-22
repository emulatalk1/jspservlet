package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession();
        Object usernameSesson = httpSession.getAttribute("username");
        if (usernameSesson != null) {
            req.getRequestDispatcher("/index").forward(req, resp);
        } else {
            req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
        }
    }
}
