package qnu.fit.dse.oop.lab12.model;

import java.io.Serializable;
import java.security.PublicKey;

public class Bill implements Serializable {
    private static final long seralVersionUID = 1L;

    private String billCode;
    private String customerName;
    private String createdDate;
    private float discount;
    private double totalPrice;

    public Bill(){
        super();
    }

    public Bill(String billCode, String customerName, String createdDate, float discount, double totalPrice) {
        this.billCode = billCode;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billCode='" + billCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", discount=" + discount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
