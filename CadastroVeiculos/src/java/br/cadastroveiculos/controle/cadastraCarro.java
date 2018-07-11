/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadastroveiculos.controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.cadastroveiculos.modelo.Carro;
import br.cadastroveiculos.dao.CarroDAO;

/**
 *
 * @author Taina Santos
 */
@WebServlet(name = "cadastraCarro", urlPatterns = {"/cadastraCarro"})
public class cadastraCarro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Carro c = new Carro();
            c.setFabricante(request.getParameter("fabricante"));
            c.setModelo(request.getParameter("modelo"));
            c.setValor(Float.parseFloat(request.getParameter("valor")));
            c.setPlaca(request.getParameter("placa"));
            c.setAno(Integer.parseInt(request.getParameter("ano")));
            
            CarroDAO cdao = new CarroDAO();
            cdao.inserir(c);
            
            out.print("<h3>" + "Cadastrado!" + "</h3>" + "<br/>" + "<br/>");
            out.print("<a href='incluirCarro.jsp'> Cadastrar outro veículo </a>" + "<br/>");
            out.print("<a href='index.html'> Voltar ao menu</a>" + "<br/>");
        } catch (Exception ex) {
            Logger.getLogger(cadastraCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(cadastraCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(cadastraCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


   