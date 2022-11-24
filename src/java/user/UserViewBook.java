/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import bean.SetBook;
import bean.User;
import bean.ViewBooking;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "UserViewBook", urlPatterns = {"/UserViewBook"})
public class UserViewBook extends HttpServlet {
    
    private JDBCUtility jdbcUtility;
    private Connection con;

    public void init() throws ServletException {
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
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        //String name, username,bankName;
        
        
        ArrayList book= new ArrayList();

        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            int BookingID,phone,roomtype,adult,children,bankNo;
            String price;
            String checkin, checkout;

            User user = (User)session.getAttribute("userprofile");
           
            String sql = "SELECT * FROM setbook WHERE username=?";
            out.print(sql);
            PreparedStatement ps = con.prepareStatement(sql);           
            ps.setString(1,"zul");
            ResultSet rs = ps.executeQuery();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             while(rs.next()){
               
                 BookingID = rs.getInt("bookingID");
                 out.print(BookingID);
                 roomtype = rs.getInt("roomtype");
                 out.print(roomtype);
                 adult = rs.getInt("adult");
                 children = rs.getInt("children");
                 price = rs.getString("price");   
                 out.print(price);
                 checkin = rs.getString("checkin");
                 out.print(checkin);
                 checkout = rs.getString("checkout");
                   out.print(checkout);
                
                 
                   ViewBooking vb;
                 vb = new ViewBooking(BookingID, roomtype, adult, children,checkin, checkout, Float.parseFloat(price));
                 book.add(vb);
                }
             
             session.setAttribute("booking", book);
             sendPage(request, response, "/ViewBooking.jsp");
             
           
        }
	catch (java.lang.Exception ex)
	{
            ex.printStackTrace ();
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
            Logger.getLogger(UserViewBook.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(UserViewBook.class.getName()).log(Level.SEVERE, null, ex);
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

    private void sendPage(HttpServletRequest request, HttpServletResponse response, String userViewBookingjsp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

}
