<<<<<<< HEAD
package com.quantify;

public class EffectiveAnnualRate {

    
    public static double calculate(double nominalAnnualRate, int compoundingPeriodsPerYear) {
        
        double nominalRateDecimal = nominalAnnualRate / 100;

        
        double ear = Math.pow(1 + (nominalRateDecimal / compoundingPeriodsPerYear), compoundingPeriodsPerYear) - 1;

       
        return ear * 100;
    }

=======
package com.quantify;

public class EffectiveAnnualRate {

    
    public static double calculate(double nominalAnnualRate, int compoundingPeriodsPerYear) {
        
        double nominalRateDecimal = nominalAnnualRate / 100;

        
        double ear = Math.pow(1 + (nominalRateDecimal / compoundingPeriodsPerYear), compoundingPeriodsPerYear) - 1;

       
        return ear * 100;
    }

>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
}