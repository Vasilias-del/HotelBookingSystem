/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import bean.UserBooking;
import bean.count;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;

/**
 *
 * @author Hafiz
 */
@WebServlet(name = "ViewStatusBooking", urlPatterns = {"/ViewStatusBooking"})
public class ViewStatusBooking extends HttpServlet {

    private JDBCUtility jdbcUtility;
    private Connection con;
    
    @Override
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
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String username = "", name = "", checkin = "", checkout = "", status="";
        int bookingid = 0, phone = 0, type = 0, adult = 0, child = 0;
        
        ArrayList<UserBooking> statusbook= new ArrayList<UserBooking>();
        
        try{
            try (PrintWriter out = response.getWriter()) {

                HttpSession session = request.getSession(true);

                String stat = "Pending";
                String sql = "SELECT * FROM setbook WHERE status=?";
                
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, stat);
                ResultSet rs = ps.executeQuery();
                
                /* TODO output your page here. You may use following sample code. */
                while(rs.next() ){

                    //extract requestbus data
                    bookingid = rs.getInt("bookingID");
                    name= rs.getString("name");
                    phone= rs.getInt("phone");
                    username= rs.getString("username");
                    type= rs.getInt("roomtype");
                    //Cout = "2018-11-20";
                    //Cin = "2018-11-20";
                    checkout = rs.getString("checkout");
                    checkin = rs.getString("checkin");
                    adult = rs.getInt("adult");
                    child = rs.getInt("children");
                    status = rs.getString("status");
                    
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date date1 = new java.util.Date();
                    java.util.Date date2 = new java.util.Date();
                    try {
                        date1 = formatter.parse(checkin);
                        date2 = formatter.parse(checkout);
                    }   
                    catch (Exception ex) {}
                
                //convert mysql date to MY date
                    formatter = new SimpleDateFormat("dd-MM-yyyy");
                    checkin = formatter.format(date1); 
                    checkout = formatter.format(date2);

                   //UserBooking userbooking= new UserBooking(BookingID, name, phone, roomtype, checkin, checkout, adult, child, price);
                   UserBooking viewstatusbook;
                   //UserBooking(int BookingID, String name, int phone, int roomtype, String checkin, String checkout, int adult, int children)
                   viewstatusbook = new UserBooking(bookingid, name, username, phone, type, checkin, checkout, adult, child, status);

                   statusbook.add(viewstatusbook);
                   
                }
                session.setAttribute("statusbook", statusbook);
                //sendPage(request, response, "/UserManageBooking.jsp");
                response.sendRedirect(request.getContextPath() + "/ViewStatusBooking.jsp");

            }
        }
        catch (SQLException ex)
	{
            while (ex != null)
            {
                System.out.println ("SQLState: " + ex.getSQLState ());
                System.out.println ("Message:  " + ex.getMessage ());
		System.out.println ("Vendor:   " + ex.getErrorCode ());
                ex = ex.getNextException ();
		System.out.println ("");
            }
            
            System.out.println("Connection to the database error");
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
