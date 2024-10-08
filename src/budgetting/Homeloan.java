/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetting;

/**
 *
 * @author mufunwawanga
 */
import java.util.Scanner;
public class Homeloan extends Expense {
    private final double purchasePrice;
    private final double totalDeposit;
    private final double interestRate;
    private final double repayments;
    public Homeloan(double purchasePrice, double totalDeposit, double interestRate, double repayments, Scanner input) {
        this.purchasePrice = purchasePrice;
        this.totalDeposit = totalDeposit;
        this.interestRate = interestRate;
        this.repayments = repayments;
    }
    @Override
    public double calculateLoan() {
        double P = purchasePrice - (totalDeposit/100 * purchasePrice);
        double i = interestRate /1200;
        double n = repayments;
        return P*i/(1 - Math.pow((1 + i), (-n)));
    }
    
    void if_loan(){
    System.out.println("Note that being granted a homeloan is unlikely due to your income...");
    }
    void else_loan(){
    System.out.println("Great you do qualify for a homeloan");
    }
    
}

