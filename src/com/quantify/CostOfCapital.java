<<<<<<< HEAD
package com.quantify;

public class CostOfCapital {

    public static double calculateCostOfCapital(double equity, double debt, double costOfEquity, double costOfDebt, double taxRate) {
        double totalValue = equity + debt;
        double weightedCostOfEquity = (equity / totalValue) * costOfEquity;
        double weightedCostOfDebt = (debt / totalValue) * costOfDebt * (1 - taxRate);
        return weightedCostOfEquity + weightedCostOfDebt;
    }
}
=======
package com.quantify;

public class CostOfCapital {

    public static double calculateCostOfCapital(double equity, double debt, double costOfEquity, double costOfDebt, double taxRate) {
        double totalValue = equity + debt;
        double weightedCostOfEquity = (equity / totalValue) * costOfEquity;
        double weightedCostOfDebt = (debt / totalValue) * costOfDebt * (1 - taxRate);
        return weightedCostOfEquity + weightedCostOfDebt;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
