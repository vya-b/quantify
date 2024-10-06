<<<<<<< HEAD
package com.quantify;

public class CreditCardInterest {

    public static double caculate(double averageDailyBalance, double annualInterestRate, int daysInBillingCycle) {
       
        double dailyInterestRate = annualInterestRate / 100 / 365;

      
        double interest = averageDailyBalance * dailyInterestRate * daysInBillingCycle;

        return interest;
    }

}
=======
package com.quantify;

public class CreditCardInterest {

    public static double caculate(double averageDailyBalance, double annualInterestRate, int daysInBillingCycle) {
       
        double dailyInterestRate = annualInterestRate / 100 / 365;

      
        double interest = averageDailyBalance * dailyInterestRate * daysInBillingCycle;

        return interest;
    }

}
>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
