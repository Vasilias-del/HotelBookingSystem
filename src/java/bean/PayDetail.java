/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author FIQMANAN
 */
public class PayDetail {
    private int cardNo, CVV ;
    private String cardBank, ExpDate, username;
    private float price;

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
