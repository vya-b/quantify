<<<<<<< HEAD
package com.quantify;

public class PERatio {
    public static double calculate(double price, double earnings) {
        if (earnings == 0) {
            throw new IllegalArgumentException("Earnings cannot be zero.");
        }
        return price / earnings;
    }
}
=======
package com.quantify;

public class PERatio {
    public static double calculate(double price, double earnings) {
        if (earnings == 0) {
            throw new IllegalArgumentException("Earnings cannot be zero.");
        }
        return price / earnings;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
