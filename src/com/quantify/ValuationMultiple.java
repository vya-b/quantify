<<<<<<< HEAD
package com.quantify;

public class ValuationMultiple {

    /**
     * Method to calculate the valuation multiple.
     * 
     * @param valueMeasure - the financial measure like earnings, revenue, etc.
     * @param valueDriver - the financial driver such as EBIT, net income, etc.
     * @return Valuation Multiple calculated as Value Measure / Value Driver.
     */
    public static double calculate(double valueMeasure, double valueDriver) {
        if (valueDriver == 0) {
            throw new IllegalArgumentException("Value Driver cannot be zero");
        }
        return valueMeasure / valueDriver;
    }
}
=======
package com.quantify;

public class ValuationMultiple {

    /**
     * Method to calculate the valuation multiple.
     * 
     * @param valueMeasure - the financial measure like earnings, revenue, etc.
     * @param valueDriver - the financial driver such as EBIT, net income, etc.
     * @return Valuation Multiple calculated as Value Measure / Value Driver.
     */
    public static double calculate(double valueMeasure, double valueDriver) {
        if (valueDriver == 0) {
            throw new IllegalArgumentException("Value Driver cannot be zero");
        }
        return valueMeasure / valueDriver;
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
