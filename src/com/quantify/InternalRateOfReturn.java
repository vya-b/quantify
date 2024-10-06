<<<<<<< HEAD
package com.quantify;

public class InternalRateOfReturn {

    public static double calculateIRR(double[] cashFlows) {
        double irr = 0.1; // Initial guess for IRR
        double npv;
        double increment = 0.0001;
        
        while (true) {
            npv = 0;
            for (int t = 0; t < cashFlows.length; t++) {
                npv += cashFlows[t] / Math.pow(1 + irr, t);
            }
            if (Math.abs(npv) < 0.01) {
                break;
            }
            irr += increment;
        }
        return irr * 100;
    }
}
=======
package com.quantify;

public class InternalRateOfReturn {

    public static double calculateIRR(double[] cashFlows) {
        double irr = 0.1; // Initial guess for IRR
        double npv;
        double increment = 0.0001;
        
        while (true) {
            npv = 0;
            for (int t = 0; t < cashFlows.length; t++) {
                npv += cashFlows[t] / Math.pow(1 + irr, t);
            }
            if (Math.abs(npv) < 0.01) {
                break;
            }
            irr += increment;
        }
        return irr * 100;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
