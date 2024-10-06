<<<<<<< HEAD
package com.quantify;

public class CompoundInterest {


    public static double calculateCompoundInterest(double principal, double annualInterestRate, int timesCompoundedPerYear, int years) {
       
        double rate = annualInterestRate / 100;

        
        double amount = principal * Math.pow(1 + (rate / timesCompoundedPerYear), timesCompoundedPerYear * years);

        return amount;
    }

=======
package com.quantify;

public class CompoundInterest {


    public static double calculateCompoundInterest(double principal, double annualInterestRate, int timesCompoundedPerYear, int years) {
       
        double rate = annualInterestRate / 100;

        
        double amount = principal * Math.pow(1 + (rate / timesCompoundedPerYear), timesCompoundedPerYear * years);

        return amount;
    }

>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
}