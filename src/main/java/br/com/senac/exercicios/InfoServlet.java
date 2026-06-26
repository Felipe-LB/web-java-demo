package br.com.senac.exercicios;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String nomeDisciplina = req.getParameter("nomeDisciplina");
        LocalDate data = LocalDate.now();
        resp.getWriter().println("<h1> Data Atual: " + data + "</h1>" );
        String versaoJava = System.getProperty("java.version");
        resp.getWriter().println("<h1> Versão do Java: " + versaoJava + "</h1>" );

        resp.getWriter().println("<h1>--> " + nomeDisciplina  + "<br>"+ data + "<br>" + versaoJava + "</h1>");

    }
}
