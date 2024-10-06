<<<<<<< HEAD
package com.quantify;

public class BondEquivalentYield {

    public static double caculate(double faceValue, double bondPrice, int daysToMaturity) {
        return ((faceValue - bondPrice) / bondPrice) * (365.0 / daysToMaturity);
    }
}
=======
package com.quantify;

public class BondEquivalentYield {

    public static double caculate(double faceValue, double bondPrice, int daysToMaturity) {
        return ((faceValue - bondPrice) / bondPrice) * (365.0 / daysToMaturity);
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
