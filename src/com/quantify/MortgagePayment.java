<<<<<<< HEAD
package com.quantify;

public class MortgagePayment {

    public static double calculateMortgagePayment(double principal, double annualInterestRate, int numberOfPayments) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}
=======
package com.quantify;

public class MortgagePayment {

    public static double calculateMortgagePayment(double principal, double annualInterestRate, int numberOfPayments) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        return (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
