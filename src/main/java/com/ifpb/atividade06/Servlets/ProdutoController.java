package com.ifpb.atividade06.Servlets;

import com.ifpb.atividade06.Dao.ProdutoDAO;
import com.ifpb.atividade06.Models.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/produto/search")
public class ProdutoController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Produto> produtos = (new ProdutoDAO()).read();

        String idProduto = req.getParameter("id");
        Produto encontrado = null;
        for (Produto p : produtos) {
            if(p.getID().equalsIgnoreCase(idProduto)){
                encontrado = new Produto(p.getNome(), p.getID(), p.getPreco());
                break;
            }
        }

        if(encontrado != null){
            req.setAttribute("produto", encontrado);
            req.getRequestDispatcher("/produto/view").forward(req,resp);
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();

            out.println("<html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Produto não encontrado!</h1>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }

    }
}
