/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import bean.PayDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;

/**
 *
 * @author FIQMANAN
 */
@WebServlet(name = "AdminPay", urlPatterns = {"/AdminPay"})
public class AdminPay extends HttpServlet {

    private JDBCUtility jdbcUtility;
    private Connection con;
    
    public void init() throws ServletException
    {
        String driver = "com.mysql.jdbc.Driver";

        String dbName = "hotel";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        con = jdbcUtility.jdbcGetConnection();
    } 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        int cardNum = Integer.parseInt(request.getParameter("cardno"));
        String cardName = request.getParameter("BankName");
        String cardExpiry = request.getParameter("ExpiredDate");
        int cardCVV = Integer.parseInt(request.getParameter("CVV"));
        float price = Float.parseFloat(request.getParameter("price"));
        String username = request.getParameter("username");
        
        String sql = "INSERT INTO paydetail(cardNo, cardBank, ExpDate, CVV, price, username) VALUES( ?, ?, ?, ?, ?, ?)"; 
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, cardNum);
            preparedStatement.setString(2, cardName);
            preparedStatement.setString(3, cardExpiry);
            preparedStatement.setInt(4, cardCVV);
            preparedStatement.setFloat(5, price);
            preparedStatement.setString(6, username);
            preparedStatement.executeUpdate();
            
            //create object to put on session 
                PayDetail paydetail = new PayDetail();
                paydetail.setCardNo(cardNum);
                paydetail.setCardBank(cardName);
                paydetail.setExpDate(cardExpiry);
                paydetail.setCVV(cardCVV);
                
            HttpSession session = request.getSession();
            session.setAttribute("paydetail", paydetail);
            response.sendRedirect(request.getContextPath() + "/AdminInvoice.jsp");
        }
        catch (SQLException ex) {  
            PrintWriter out = response.getWriter();
            out.println("data tak masuk");    
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(userpay.class.getName()).log(Level.SEVERE, null, ex);
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
