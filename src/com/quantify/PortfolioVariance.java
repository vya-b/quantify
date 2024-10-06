<<<<<<< HEAD
package com.quantify;

public class PortfolioVariance {

    public static double calculate(double[] assetWeights, double[][] covarianceMatrix) {
        double portfolioVariance = 0;
        for (int i = 0; i < assetWeights.length; i++) {
            for (int j = 0; j < assetWeights.length; j++) {
                portfolioVariance += assetWeights[i] * assetWeights[j] * covarianceMatrix[i][j];
            }
        }
        return portfolioVariance;
    }
}
=======
package com.quantify;

public class PortfolioVariance {

    public static double calculate(double[] assetWeights, double[][] covarianceMatrix) {
        double portfolioVariance = 0;
        for (int i = 0; i < assetWeights.length; i++) {
            for (int j = 0; j < assetWeights.length; j++) {
                portfolioVariance += assetWeights[i] * assetWeights[j] * covarianceMatrix[i][j];
            }
        }
        return portfolioVariance;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
