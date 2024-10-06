<<<<<<< HEAD
package com.quantify;

public class DownsideRisk {

    public static double calculate(double[] portfolioReturns, double minimumAcceptableReturn) {
        double downsideVariance = 0;
        int count = 0;

        for (double portfolioReturn : portfolioReturns) {
            if (portfolioReturn < minimumAcceptableReturn) {
                downsideVariance += Math.pow(portfolioReturn - minimumAcceptableReturn, 2);
                count++;
            }
        }

        return Math.sqrt(downsideVariance / count);
    }
}
=======
package com.quantify;

public class DownsideRisk {

    public static double calculate(double[] portfolioReturns, double minimumAcceptableReturn) {
        double downsideVariance = 0;
        int count = 0;

        for (double portfolioReturn : portfolioReturns) {
            if (portfolioReturn < minimumAcceptableReturn) {
                downsideVariance += Math.pow(portfolioReturn - minimumAcceptableReturn, 2);
                count++;
            }
        }

        return Math.sqrt(downsideVariance / count);
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
