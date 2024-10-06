<<<<<<< HEAD
package com.quantify;

public class BondPrice {

    public static double calculate(double faceValue, double couponRate, int periods, double discountRate) {
        double price = 0.0;
        double couponPayment = faceValue * couponRate;

        for (int t = 1; t <= periods; t++) {
            price += couponPayment / Math.pow(1 + discountRate, t);
        }

        price += faceValue / Math.pow(1 + discountRate, periods);
        return price;
    }
}
=======
package com.quantify;

public class BondPrice {

    public static double calculate(double faceValue, double couponRate, int periods, double discountRate) {
        double price = 0.0;
        double couponPayment = faceValue * couponRate;

        for (int t = 1; t <= periods; t++) {
            price += couponPayment / Math.pow(1 + discountRate, t);
        }

        price += faceValue / Math.pow(1 + discountRate, periods);
        return price;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
