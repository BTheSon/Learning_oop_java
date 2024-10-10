package qnu.fit.dse.oop.lab04.methodoverloading;

public class BasicRateTax {
    private static final double BASE_INCOME = 1000.0;
    private static final double BASIC_TAX_RATE = 0.20;

    public double calcTax() {
        return BASE_INCOME * BASIC_TAX_RATE;
    }
    public double calcTax(double grossIncome) {
        return grossIncome > BASE_INCOME? grossIncome * BASIC_TAX_RATE : this.calcTax();
    }
}
