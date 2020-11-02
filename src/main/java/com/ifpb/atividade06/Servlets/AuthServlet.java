package com.ifpb.atividade06.Servlets;

import com.ifpb.atividade06.Dao.UserDAO;
import com.ifpb.atividade06.Models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/auth")
public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new UserDAO().auth(username, password);

        if(user != null){
            req.setAttribute("user", user);
            req.getRequestDispatcher("search.jsp").forward(req, resp);
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Usuario ou senha não cadastrado!</h1>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}
