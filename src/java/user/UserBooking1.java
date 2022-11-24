/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import bean.UserBooking;
import bean.SetBook;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;
import java.util.Date;

/**
 *
 * @author FIQMANAN
 */
@WebServlet(name = "UserBooking1", urlPatterns = {"/UserBooking1"})
public class UserBooking1 extends HttpServlet {
    
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
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        float selectprice = (float) 0.00;
        
        Random random = new Random();
        int number=0;
        
        for(int counter=1; counter<=1;counter++){
        number = 1+random.nextInt(100000);
        }
        
        int bookingID = number;
        String name = request.getParameter("name");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String username = request.getParameter("username");
        int roomtype = Integer.parseInt(request.getParameter("roomtype"));
        String status = request.getParameter("status");
        if(roomtype == 1)
            selectprice = (float) 180.98;
        
        if(roomtype == 2)
            selectprice = (float) 398.87;
        
        if(roomtype == 3)
            selectprice = (float) 534.32;
        
        int adult = Integer.parseInt(request.getParameter("adult"));
        int children = Integer.parseInt(request.getParameter("children"));
        float price = selectprice;
        String datein = request.getParameter("checkin");
        String dateout = request.getParameter("checkout");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        String checkin = datein;
        String checkout = dateout;
        
        Date date1 = new Date();
        Date date2 = new Date();
        
        //convert string to date
        try {
            date1 = sdf.parse(datein);
            date2 = sdf.parse(dateout);
        } 
        catch (Exception ex) {            
        }
        
        //convert to mysql date
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        datein = sdf.format(date1);
        dateout = sdf.format(date2); 
        
        //java.util.Date checkin = sdf.parse(datein);
        //java.util.Date checkout = sdf.parse(dateout);
        
        String sqlInsert = "INSERT INTO setBook(BookingID, name, phone, username, roomtype,checkin,checkout, adult,children,price,status) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //String sqlInsert = "INSERT INTO setBook(BookingID, name, phone, username, roomtype,adult,children) VALUES(?, ?, ?, ?, ?, ?, ?)"; 
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            PreparedStatement preparedStatement = con.prepareStatement(sqlInsert);
            preparedStatement.setInt(1, bookingID);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, phone);
            preparedStatement.setString(4, username);
            preparedStatement.setInt(5, roomtype);
            preparedStatement.setString(6, datein);
            preparedStatement.setString(7, dateout);
            preparedStatement.setInt(8, adult);
            preparedStatement.setInt(9, children);
            preparedStatement.setFloat(10,price);
            preparedStatement.setString(11,status);
            preparedStatement.executeUpdate();
            
            UserBooking setbook = new UserBooking();
            setbook.setBookingID(bookingID);
            setbook.setName(name);
            setbook.setPhone(phone);
            setbook.setUsername(username);
            setbook.setRoomtype(roomtype);
            setbook.setCheckin(checkin);
            setbook.setCheckout(checkout);
            setbook.setAdult(adult);
            setbook.setChildren(children);
            setbook.setPrice(price);
            
            HttpSession session = request.getSession();
            session.setAttribute("userbooking", setbook);
            response.sendRedirect(request.getContextPath() + "/BookingPayment.jsp");
        }
        catch (SQLException ex) {            
            System.out.println("enter here");
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
        } catch (ParseException ex) {
            Logger.getLogger(UserBooking1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserBooking1.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ParseException ex) {
            Logger.getLogger(UserBooking1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserBooking1.class.getName()).log(Level.SEVERE, null, ex);
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
