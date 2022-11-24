/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import bean.User;
import bean.count;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
@WebServlet(name = "AdminLogin", urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {
    
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
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //int pending;
        
        User user;
        user = null;
        count kira = new count();
        //Get the session object
	HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password;
        password = request.getParameter("password");
        //String userType = "", fullName = "", image = "";
        
        String sqlQuery = "SELECT * FROM user WHERE username = ? AND password = ? AND usertype = 'admin'";
        String sqlQuery2 = "SELECT * FROM setbook";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            
            PreparedStatement sqlretrive = con.prepareStatement(sqlQuery2);
            ResultSet rs2 = sqlretrive.executeQuery();
            int pending=0;
            int reject=0;
            int accept=0;
            
            while (rs2.next()){
                String status = rs2.getString("status");
                if(status.equals("pending"))
                    pending = pending + 1;
                
                if(status.equals("rejected"))
                    reject = reject + 1;
                
                if(status.equals("approved"))
                    accept = accept + 1;
            }  
                kira.setPending(pending);
                kira.setAccept(accept);
                kira.setReject(reject);
                
            while (rs.next()) {
                String userType = rs.getString("usertype");
                String fullName = rs.getString("fullname");
                String image = rs.getString("image");
                password = rs.getString("password");
                
                user = new User();
                user.setUsername(username);
                user.setFullName(fullName);
                user.setUserType(userType);
                user.setPassword(password);
                user.setImage(image);
                
            }
        }
        catch (SQLException ex) {            
        }
        
        if (user != null) {
            session.setAttribute("report",kira);
            session.setAttribute("memberprofile", user);
            response.sendRedirect(request.getContextPath() + "/MainPageAdmin.jsp");
        }
        else {
            response.sendRedirect(request.getContextPath() + "/AdminLogin.jsp");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
