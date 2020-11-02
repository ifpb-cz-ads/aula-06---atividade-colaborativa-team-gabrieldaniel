package com.ifpb.atividade06.Servlets;

import com.ifpb.atividade06.Models.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/produto/view")
public class ProdutoView extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produto produto = (Produto) req.getAttribute("produto");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
        out.println("ID: "+produto.getID()+"<br>");
        out.println("NOME: "+produto.getNome()+"<br>");
        out.println("PREÇO: "+produto.getPreco()+"<br>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }
}
