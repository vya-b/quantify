<<<<<<< HEAD
package com.quantify;

public class LoanAmmortization {

    
    public static double calculate(double loanAmount, double annualInterestRate, int loanTermYears) {
     
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        
        int loanTermMonths = loanTermYears * 12;

       
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermMonths)) 
                              / (Math.pow(1 + monthlyInterestRate, loanTermMonths) - 1);

        return monthlyPayment;
    }

=======
package com.quantify;

public class LoanAmmortization {

    
    public static double calculate(double loanAmount, double annualInterestRate, int loanTermYears) {
     
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        
        int loanTermMonths = loanTermYears * 12;

       
        double monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTermMonths)) 
                              / (Math.pow(1 + monthlyInterestRate, loanTermMonths) - 1);

        return monthlyPayment;
    }

>>>>>>> 45c00fe6d93aeab20fe92f7bd75371da1b429a19
}