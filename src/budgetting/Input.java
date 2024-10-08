/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mufunwawanga
 */
public class Input {
    private List<Double> values = new ArrayList<>();
    private final Scanner input;
    public Input() {
    this.input = new Scanner(System.in);
    this.values = new ArrayList<>();
    }

    public double Income(Scanner input){
    System.out.println("Enter the Monthly income: ");
    return input.nextDouble();
    }
    public double TaxDeductions(Scanner input, double income){
    System.out.println("Enter the tax deduction: ");
    input.nextLine();
    return input.nextDouble()/100*income;
    }
    public double Groceries(Scanner input){
    System.out.println("Enter the Grocery costs: ");
    input.nextLine();
    return input.nextDouble();
    }
    public double Water(Scanner input){
    System.out.println("Enter the water bill: ");
    return input.nextDouble();
    }
    public double Lights(Scanner input){
    System.out.println("Enter the electricity bill: ");
    return input.nextDouble();
    }
    public double Travel(Scanner input){
    System.out.println("Enter the travel costs(incl fuel): ");
    return input.nextDouble();
    }
    public double Phone(Scanner input){
    System.out.println("Enter the total phone cost:");
    return input.nextDouble();
    }
    public double OtherExpenses(Scanner input){
    System.out.println("Enter other Monthly living costs: ");
    return input.nextDouble();
    }
    public int PropertyChoice(Scanner input){
    System.out.println("are you buying or renting property?\n1.Renting\n2.buying");
    return input.nextInt();
    }
    public double Renting(Scanner input){
    System.out.println("Enter the renting cost: ");
    return input.nextDouble();
    }
    public double MonthlyMoney(double earned,List<Double> values){
    double sum = 0;  
    for(double value : values){
    sum += value;
    }
       return earned - sum; 
    }
    
    public double MonthlyExpenses(List<Double> values){
        double sum = 0;  
    for(double value : values){
    sum += value;
    }
    return sum;
    }
    
    public double getInput(Scanner input, String message){
        System.out.println(message);
    return input.nextDouble();
    }
    public int work_AgainA(Scanner input){
        System.out.println("Due to the error you can choose to select... \n1.to check again\n2.to terminate");
        return input.nextInt();
    }
    public int work_AgainB(Scanner input){
        System.out.println("\tThe Operation is done! you can select... \n1.to check again\n2.to terminate");
        return input.nextInt();
    }
    public void close() {
    input.close();
    }
}
