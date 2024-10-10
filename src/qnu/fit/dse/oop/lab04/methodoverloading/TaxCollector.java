package qnu.fit.dse.oop.lab04.methodoverloading;

/*
lop nay chua

 */
public class TaxCollector {

    public static void main(String[] args) {
        // khoi tao doi tuong BasicRateTax
        BasicRateTax basicRateTax = new BasicRateTax();
        // lay doi so tu terminal
        double grossIncome = Double.parseDouble(args[0]);
        // in ket qua
        System.out.println("Thue phai nop: " + basicRateTax.calcTax(grossIncome));

    }
}
