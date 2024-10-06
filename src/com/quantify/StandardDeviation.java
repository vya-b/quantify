<<<<<<< HEAD
package com.quantify;

public class StandardDeviation {

    public static double calculate(double[] assetReturns) {
        double mean = 0;
        for (double assetReturn : assetReturns) {
            mean += assetReturn;
        }
        mean /= assetReturns.length;

        double variance = 0;
        for (double assetReturn : assetReturns) {
            variance += Math.pow(assetReturn - mean, 2);
        }
        variance /= (assetReturns.length - 1);

        return Math.sqrt(variance);
    }
}
=======
package com.quantify;

public class StandardDeviation {

    public static double calculate(double[] assetReturns) {
        double mean = 0;
        for (double assetReturn : assetReturns) {
            mean += assetReturn;
        }
        mean /= assetReturns.length;

        double variance = 0;
        for (double assetReturn : assetReturns) {
            variance += Math.pow(assetReturn - mean, 2);
        }
        variance /= (assetReturns.length - 1);

        return Math.sqrt(variance);
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
