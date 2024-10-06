<<<<<<< HEAD
package com.quantify;

public class PortfolioReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double portfolioReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            portfolioReturn += assetReturns[i] * assetWeights[i];
        }
        return portfolioReturn;
    }
}
=======
package com.quantify;

public class PortfolioReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double portfolioReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            portfolioReturn += assetReturns[i] * assetWeights[i];
        }
        return portfolioReturn;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
