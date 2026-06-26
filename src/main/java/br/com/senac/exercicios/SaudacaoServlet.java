package br.com.senac.exercicios;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/saudacao")
public class SaudacaoServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");

        if (name == null || name.trim().isEmpty()){
            name = "visitante";
        }

        if (name.equals("visitante")){
            resp.getWriter().println("<h1>→ Olá, " + name + " Seja bem-vindo(a)!</h1>");

        } else if(name.length()<2){
            resp.getWriter().println("<h1 style='color: red;'>→ Erro: nome deve ter ao menos 2 caracteres.</h1>");
        } else {
            resp.getWriter().println("<h1>→ Olá, " + name + "! Seja bem-vindo(a)!</h1>");
        }

    }
}
