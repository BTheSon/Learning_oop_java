package qnu.fit.dse.oop.lab12.model;

import java.io.Serializable;

public class Item implements Serializable {
    private static final long seralVersionUID = 1L;

    private String productName;
    private String billCode;
    private int quantity;
    private double price;

    public Item() {
        super();
    }

    public Item(String productName, String billCode, int quantity, double price) {
        this.productName = productName;
        this.billCode = billCode;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
