/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
/**
 *
 * @author user
 */
public class SetBook implements Serializable{
    private int bookingid, phone, type, adult, child;
    private String name, username;
    private String Cin, Cout;
    private float price;
  
     public SetBook(int bookingid, String name, int phone, String username, int type, String Cin, String Cout, int adult, int child){
        this.bookingid = bookingid;
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.type = type;
        this.Cin = Cin;
        this.Cout = Cout;
        this.adult = adult;
        this.child = child;
    }

    public SetBook() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the bookingid
     */
    public int getBookingid() {
        return bookingid;
    }

    /**
     * @param bookingid the bookingid to set
     */
    public void setBookingid(int bookingid) {
        this.bookingid = bookingid;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the adult
     */
    public int getAdult() {
        return adult;
    }

    /**
     * @param adult the adult to set
     */
    public void setAdult(int adult) {
        this.adult = adult;
    }

    /**
     * @return the child
     */
    public int getChild() {
        return child;
    }

    /**
     * @param child the child to set
     */
    public void setChild(int child) {
        this.child = child;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
        public String getUsername() {
        return username;
    }

    /**
     * @param username the name to set
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * @return the Cin
     */
    public String getCin() {
        return Cin;
    }

    /**
     * @param Cin the Cin to set
     */
    public void setCin(String Cin) {
        this.Cin = Cin;
    }

    /**
     * @return the Cout
     */
    public String getCout() {
        return Cout;
    }

    /**
     * @param Cout the Cout to set
     */
    public void setCout(String Cout) {
        this.Cout = Cout;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    } 
    
}

