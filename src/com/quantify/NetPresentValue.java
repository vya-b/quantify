<<<<<<< HEAD
package com.quantify;

public class NetPresentValue {

    public static double calculateNPV(double[] cashFlows, double discountRate) {
        double npv = 0;
        for (int t = 0; t < cashFlows.length; t++) {
            npv += cashFlows[t] / Math.pow(1 + discountRate, t);
        }
        return npv;
    }
}
=======
package com.quantify;

public class NetPresentValue {

    public static double calculateNPV(double[] cashFlows, double discountRate) {
        double npv = 0;
        for (int t = 0; t < cashFlows.length; t++) {
            npv += cashFlows[t] / Math.pow(1 + discountRate, t);
        }
        return npv;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
