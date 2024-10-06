<<<<<<< HEAD
package com.quantify;

public class ExpectedShortfall {

    public static double calculate(double[] portfolioReturns, double valueAtRisk) {
        double totalLosses = 0;
        int count = 0;

        for (double returnVal : portfolioReturns) {
            if (returnVal < valueAtRisk) {
                totalLosses += returnVal;
                count++;
            }
        }

        return totalLosses / count;
    }
}
=======
package com.quantify;

public class ExpectedShortfall {

    public static double calculate(double[] portfolioReturns, double valueAtRisk) {
        double totalLosses = 0;
        int count = 0;

        for (double returnVal : portfolioReturns) {
            if (returnVal < valueAtRisk) {
                totalLosses += returnVal;
                count++;
            }
        }

        return totalLosses / count;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
