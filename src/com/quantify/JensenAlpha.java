<<<<<<< HEAD
package com.quantify;

public class JensenAlpha {

    public static double calculate(double portfolioReturn, double riskFreeRate, double beta, double marketReturn) {
        return portfolioReturn - (riskFreeRate + beta * (marketReturn - riskFreeRate));
    }
}
=======
package com.quantify;

public class JensenAlpha {

    public static double calculate(double portfolioReturn, double riskFreeRate, double beta, double marketReturn) {
        return portfolioReturn - (riskFreeRate + beta * (marketReturn - riskFreeRate));
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
