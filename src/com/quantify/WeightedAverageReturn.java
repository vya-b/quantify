<<<<<<< HEAD
package com.quantify;

public class WeightedAverageReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double weightedAverageReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            weightedAverageReturn += assetReturns[i] * assetWeights[i];
        }
        return weightedAverageReturn;
    }
}
=======
package com.quantify;

public class WeightedAverageReturn {

    public static double calculate(double[] assetReturns, double[] assetWeights) {
        double weightedAverageReturn = 0;
        for (int i = 0; i < assetReturns.length; i++) {
            weightedAverageReturn += assetReturns[i] * assetWeights[i];
        }
        return weightedAverageReturn;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
