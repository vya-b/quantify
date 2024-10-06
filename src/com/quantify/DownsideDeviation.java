<<<<<<< HEAD
package com.quantify;

public class DownsideDeviation {

    public static double calculate(double[] assetReturns, double minimumAcceptableReturn) {
        double downsideVariance = 0;
        int count = 0;
        for (double assetReturn : assetReturns) { 
            if (assetReturn < minimumAcceptableReturn) {
                downsideVariance += Math.pow(assetReturn - minimumAcceptableReturn, 2);
                count++;
            }
        }
        return count > 0 ? Math.sqrt(downsideVariance / count) : 0;  
    }
}
=======
package com.quantify;

public class DownsideDeviation {

    public static double calculate(double[] assetReturns, double minimumAcceptableReturn) {
        double downsideVariance = 0;
        int count = 0;
        for (double assetReturn : assetReturns) { 
            if (assetReturn < minimumAcceptableReturn) {
                downsideVariance += Math.pow(assetReturn - minimumAcceptableReturn, 2);
                count++;
            }
        }
        return count > 0 ? Math.sqrt(downsideVariance / count) : 0;  
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
