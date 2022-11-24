/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author FIQMANAN
 */
public class ViewBooking {
    private int BookingID,phone,roomtype,adult,children;
    private String name, username;
    private String checkin,checkout;
    private float price,totalprice;
    
    private int cardNo, CVV ;
    private String cardBank, ExpDate;
    
    public ViewBooking(int BookingID, int roomtype, int adult, int children, String checkin, String checkout, float price){
        this.BookingID = BookingID;
        this.roomtype = roomtype;
        this.adult = adult;
        this.children = children;
        this.checkin = checkin;
        this.checkout = checkout;
        this.price = price;
     
    }
    /**
     * @return the BookingID
     */
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
     * @return the cardNo
     */
    public int getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the CVV
     */
    public int getCVV() {
        return CVV;
    }

    /**
     * @param CVV the CVV to set
     */
    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    /**
     * @return the cardBank
     */
    public String getCardBank() {
        return cardBank;
    }

    /**
     * @param cardBank the cardBank to set
     */
    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }

    /**
     * @return the ExpDate
     */
    public String getExpDate() {
        return ExpDate;
    }

    /**
     * @param ExpDate the ExpDate to set
     */
    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

    /**
     * @return the totalprice
     */
    public float getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
    
}
