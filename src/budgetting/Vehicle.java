/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetting;

import java.util.Scanner;

/**
 *
 * @author mufunwawanga
 */
public class Vehicle {
    Scanner inputObject = new Scanner(System.in);
    private String make;
    private String model;
    private double priceOfPurchase;
    private double totalDeposit;
    private double interest;
    private double insurance;
    
    public double getPriceOfPurchase(){
    return priceOfPurchase;
    }
    public double getTotalDeposit(){
    return totalDeposit;
    }
    public double getInterest(){
    return interest;
    }
    public double getInsurance(){
    return insurance;
    }
    public String getMake(){
    return make;
    }
    public String getModel(){
    return model;
    }
    private void setMake() {
    System.out.print("Enter the Make: ");
    make = inputObject.next();
    }

    private void setModel() {
    System.out.print("Enter the Model: ");
    model = inputObject.next();
    inputObject.nextLine();
    }
    private void setPriceOfPurchase(){
    System.out.print("Enter the Price of Purchase: ");
    priceOfPurchase = inputObject.nextDouble();
    }
    private void setTotalDeposit(){
    System.out.print("Enter the total deposit(%): ");
    totalDeposit = inputObject.nextDouble()*priceOfPurchase/100;
    }
    private void setInterestRate(){
    System.out.print("Enter the Interest rate(%): ");
    interest = inputObject.nextDouble();
    }
    private void setInsurancePremium(){
    System.out.print("Enter the insurance premium to be paid: ");
    insurance = inputObject.nextDouble();
    }
    public void setUserDaTa(){
        System.out.println("\tYou may Enter the car details...");
        boolean choice = true;
        while(choice){
            try{
        setMake();
        setModel();
        setPriceOfPurchase();
        setTotalDeposit();
        setInterestRate();
        setInsurancePremium();
        }
        catch(Exception e){
            System.out.println("");
            System.out.println("Please enter valid values.");
            choice = true;
            if(choice){
            inputObject.next();
            continue;
            }
        }
        choice = false;
        if(choice){
        break;
        }
    }
    }
    private double CarLoan(){
    return (priceOfPurchase-totalDeposit)*(interest/1200)/(1-Math.pow((1+interest/1200), -60)) + insurance;
    }
    public double getCarLoan(){
    return CarLoan();
    }
}
