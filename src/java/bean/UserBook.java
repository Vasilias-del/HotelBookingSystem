/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
/**
 *
 * @author Hafiz
 */
public class UserBook {
    private int BookingID,phone,roomtype,adult,children;
    private String name, username;
    private String checkin,checkout;
    private float price;
    private String status;
    /**
     * @return the BookingID
     */
    public UserBook(int BookingID, String name, int phone, int roomtype, String checkin, String checkout, int adult, int children, float price, String status){
        this.BookingID = BookingID;
        this.name = name;
        this.phone = phone;
        this.roomtype = roomtype;
        this.checkin = checkin;
        this.checkout = checkout;
        this.adult = adult;
        this.children = children;
        this.price = price;
        this.status = status;
    }
    
    public int getBookingID() {
        return BookingID;
    }

    /**
     * @param BookingID the BookingID to set
     */
    public void setBookingID(int BookingID) {
        this.BookingID = BookingID;
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
     * @return the roomtype
     */
    public int getRoomtype() {
        return roomtype;
    }

    /**
     * @param roomtype the roomtype to set
     */
    public void setRoomtype(int roomtype) {
        this.roomtype = roomtype;
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
     * @return the children
     */
    public int getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(int children) {
        this.children = children;
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

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the checkin
     */
    public String getCheckin() {
        return checkin;
    }

    /**
     * @param checkin the checkin to set
     */
    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    /**
     * @return the checkout
     */
    public String getCheckout() {
        return checkout;
    }

    /**
     * @param checkout the checkout to set
     */
    public void setCheckout(String checkout) {
        this.checkout = checkout;
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
    
    /**
     * @return the checkin
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param checkin the checkin to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

