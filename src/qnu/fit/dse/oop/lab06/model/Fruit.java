package qnu.fit.dse.oop.lab06.model;

import qnu.fit.dse.oop.lab06.hashmapdemo.HashMapExample;

public class Fruit implements Comparable<Fruit>{
    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Fruit compareFruit) {
        int compareQuantity = compareFruit.getQuantity();
        return this.quantity - compareQuantity;
    }

    @Override
    public String toString() {
        return "Fruit {fruitName=" + fruitName + ", fruitDesc=" +
                fruitDesc + ", quantity=" + quantity + "}";
    }
}
