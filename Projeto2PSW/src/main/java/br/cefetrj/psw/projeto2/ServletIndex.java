/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.projeto2;

import static java.awt.SystemColor.text;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author denis
 * @version 2.0
 */
@WebServlet(name = "ServletIndex", urlPatterns = {"/ServletIndex"})
public class ServletIndex extends HttpServlet {
    
    private ArrayList<Aluno> historico = new ArrayList<Aluno>();
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try{
        String aluno = req.getParameter("aluno");
        double frequencia = Double.parseDouble(req.getParameter("frequencia"));
        double p1 = Double.parseDouble(req.getParameter("nota1"));
        double trabalho= Double.parseDouble(req.getParameter("trabalho"));
        double projeto = Double.parseDouble(req.getParameter("projeto"));
        double pf = Double.parseDouble(req.getParameter("PF"));
        Aluno student = new Aluno(aluno,frequencia,p1,trabalho,projeto,pf);
                
        historico.add(student);
               
        resp.getWriter().print("<!DOCTYPE html>");
        resp.getWriter().print("<html>");
        resp.getWriter().print("<head>");
                resp.getWriter().print("<meta charset=\"ISO-8859-1\">");
                resp.getWriter().print("<title>Histórico de Notas</title>");
                resp.getWriter().print("</head>");
                resp.getWriter().print("<body>");

                resp.getWriter().print("<table border=\"1\">"); 
                resp.getWriter().print("<tr>"); 
                resp.getWriter().print("<td>Aluno</td>");
                resp.getWriter().print("<td>Nota1</td>");
                resp.getWriter().print("<td>Trabalho</td>");
                resp.getWriter().print("<td>Projeto</td>");
                resp.getWriter().print("<td>Prova Final</td>");
                resp.getWriter().print("<td>Situação</td>");
            resp.getWriter().print("</tr>");
        
        for(int i=0;i<historico.size();i++){
            Aluno x = historico.get(i);
            resp.getWriter().print("<tr id=linha"+i+2+">"); 
                    resp.getWriter().print("<td>" +x.getNome() +"</td>");
                    resp.getWriter().print("<td>" +x.getP1() +"</td>");
                    resp.getWriter().print("<td>" +x.getTrabalho() +"</td>");
                    resp.getWriter().print("<td>" +x.getProjeto() +"</td>");
                    resp.getWriter().print("<td>" +x.getPf() +"</td>");
                    resp.getWriter().print("<td>" +x.situacao() +"</td>");
            resp.getWriter().print("</tr>");
        }
        resp.getWriter().print("</table>");



        resp.getWriter().print("</body>");
        resp.getWriter().print("</html>");
        
        }catch(Exception o){
            resp.getWriter().print("Entre com um número válido");
            return;
        }
          
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    
       
    }

