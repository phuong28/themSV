/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class svlqlSV extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
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
        
        doPost(request, response);
        
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
        Enumeration<String> paraNames=request.getParameterNames();
        String paraName="";
        String paraMsv ="";
        String parahodem ="";
        String paraten ="";
        String paradt ="";
        String paraemail ="";
        while(paraNames.hasMoreElements()){
            paraName = (String)paraNames.nextElement();
            if(paraName.equals("parmasv")) paraMsv =(String) request.getParameter(paraName);
            if(paraName.equals("parhodem")) parahodem=(String) request.getParameter(paraName);
            if(paraName.equals("parten")) paraten=(String) request.getParameter(paraName);
            if(paraName.equals("pardt")) paradt=(String) request.getParameter(paraName);
            if(paraName.equals("paremail")) paraemail=(String) request.getParameter(paraName);
            
        }
        try {
            SV objsv=new SV(paraMsv,parahodem,paraten,paradt,paraemail);
            objsv.addSV();
            
        } catch (Exception e) {
            e.printStackTrace();
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
