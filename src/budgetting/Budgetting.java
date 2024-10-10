/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetting;

import java.util.*;
/**
 *
 * @author mufunwawanga
 */
public class Budgetting {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    //leave or not the variable for deciding to continue should the user mistakenly makes an error
    int leaveOrNot;
    boolean decision = true;
    //array list
    ArrayList<Double> all_Expenses = new ArrayList<>();
    //input object
    Scanner entry = new Scanner(System.in);
    //input class object
     Input inputHandler = new Input();
    //while loop to work with exeption statements to repeat a process
    while (decision) {
    //the sorting class to sort in descending
    Sort elements = new Sort();
        //part 2 additions from class Car
        Car car = new Car();
    
    try {
        //thw usual expenses input
        double income = inputHandler.Income(entry);
        double tax = inputHandler.TaxDeductions(entry, income);
        double groceries = inputHandler.Groceries(entry);
        double water = inputHandler.Water(entry);
        double lights = inputHandler.Lights(entry);
        double travel = inputHandler.Travel(entry);
        double phone = inputHandler.Phone(entry);
        double others = inputHandler.OtherExpenses(entry);
        
        //addition of the monthly deductions to the array list
        all_Expenses.add(tax);
        all_Expenses.add(groceries);
        all_Expenses.add(water);
        all_Expenses.add(lights);
        all_Expenses.add(travel);
        all_Expenses.add(phone);
        all_Expenses.add(others);
        int propertyChoice = inputHandler.PropertyChoice(entry);
        //choise of property boolean body
        if(propertyChoice == 1){
        double rent = inputHandler.Renting(entry);
        all_Expenses.add(rent);
        double AvailableMoney = inputHandler.MonthlyMoney(income, all_Expenses);
        System.out.printf("Available money after deductions(excl vehicle purchase): R"+"%.2f",AvailableMoney);
        System.out.println("");
        car.showCars();
        if( AvailableMoney > 0 && AvailableMoney < 5000){
        System.out.println("\t\nSorry, it seems that you can't choose any of the options above.\n");
        elements.Display(all_Expenses);
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        else if(AvailableMoney >= 5000){//monthly money can determine cars you can purchase...
        int carChoice = car.ifCar();
        if(carChoice == 1){
        car.setUserDaTa();//input method from car class
        double carLoanValue = car.getCarLoan();
        all_Expenses.add(carLoanValue);//adding the loan ammount of the car alongside the insurance on the
        double percentDelegate = inputHandler.MonthlyExpenses(all_Expenses);
        
        if(percentDelegate > (0.75*income)){
        PercentageControl delegation = new PercentageControl((Percentile) new PercentageOver());
        delegation.ShowOption();
        }
        else if(percentDelegate <= (0.75*income)){
        PercentageControl delegation = new PercentageControl((Percentile) new PercentageUnder());
        delegation.ShowOption();
        }
        double AvailableMoney2 = inputHandler.MonthlyMoney(income, all_Expenses);
        System.out.printf("Available money after all deductions: R"+"%.2f",AvailableMoney2);
        System.out.println("");
        elements.Display(all_Expenses);
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        else if(carChoice == 2){    
            
        //Method call to display the expenses in descending order
        elements.Display(all_Expenses);
        
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        //Method call to display the expenses in descending order
        elements.Display(all_Expenses);
        
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        }
        else if(propertyChoice == 2){
            
        //object passing was used here to request input of these fields
        double purchasePrice = inputHandler.getInput(entry, "Enter Purchase Price: ");
        double totalDeposit = inputHandler.getInput(entry, "Enter Total Deposit (%): ");
        double interestRate = inputHandler.getInput(entry, "Enter Interest Rate (%): ");
        double repaymentrys = inputHandler.getInput(entry, "Enter Repayment Period (months 240-360): ");
        Homeloan homeloan = new Homeloan(purchasePrice, totalDeposit, interestRate, repaymentrys, entry);
        double loanRepaymentry = homeloan.calculateLoan();
        if(loanRepaymentry > (income/3)){
        homeloan.if_loan();
        }
        else{
        homeloan.else_loan();
        }
        all_Expenses.add(loanRepaymentry);
        double AvailableMoney = inputHandler.MonthlyMoney(income, all_Expenses);
        System.out.printf("Available Monthly money(excl vehicle purchase) : R"+"%.2f",AvailableMoney);
        System.out.println("");
        
        car.showCars();
        if( AvailableMoney > 0 && AvailableMoney < 5000){
        System.out.println("\t\nIt seems that you can't choose any of the options above.\n");
        elements.Display(all_Expenses);
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        else if(AvailableMoney >5000){
        int carChoice = car.ifCar();
        if(carChoice == 1){
        car.setUserDaTa();
        double carLoanValue = car.getCarLoan(); 
        all_Expenses.add(carLoanValue);
        double percentryDelegate = inputHandler.MonthlyExpenses(all_Expenses);
        
        //repeating what was done for renting
        if(percentryDelegate > (0.75*income)){
        PercentageControl delegation = new PercentageControl((Percentile) new PercentageOver());
        delegation.ShowOption();
        }
        else if(percentryDelegate <= (0.75*income)){
        PercentageControl delegation = new PercentageControl((Percentile) new PercentageUnder());
        delegation.ShowOption();
        }
        double AvailableMoney2 = inputHandler.MonthlyMoney(income, all_Expenses);
        System.out.printf("Available money after all deductions: R"+"%.2f",AvailableMoney2);
        System.out.println("");
        elements.Display(all_Expenses);
        
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        else if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        else if(carChoice == 2){
        //Method call to display the expenses in descending order
        elements.Display(all_Expenses);
        leaveOrNot = inputHandler.work_AgainB(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();
        }
        if(leaveOrNot == 2){
        System.out.println("Thank you for working with us...");
        break;
        }
        }
        }
        }
    } 
    catch (Exception e) {
        System.out.println("It appears we have detected an error in your input.");
        entry.next(); // Clearing the invalid input
        System.out.println("");
        entry.nextLine();//returning the input of leaveOrNot
        leaveOrNot = inputHandler.work_AgainA(entry);
        if(leaveOrNot == 1){
        all_Expenses.clear();// clearing the List for the exception caught
        }
        else if (leaveOrNot == 2) {
        System.out.println("Thank you for working with us...");
        break;
        }
    }
    } 
    entry.close();
    }
}
