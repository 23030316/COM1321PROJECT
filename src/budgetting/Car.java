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
public class Car extends Vehicle{
    String[][] cars = {
        {"Make   ", "Model  ", "price   "},
        {"________", "________", "________"},
        {"1.Toyota", "Yarris", "R200,000"},
        {"2.Mercedes benz", "C-class", "R400,000"},
        {"3.Nissan", "Almera", "R1,200,200"},
        {"4.VolksWagen", "Golf-08", "R500,000"}
    };
    public void showCars(){
    System.out.println("Here are the available vehicle options should you decide to but a car:");
    for(int i = 0; i<6;i++){
    for(int j = 0; j<3; j++){
    System.out.print(cars[i][j]+"   ");
    }
    System.out.println("");
    }
    }
    //to indicate that car can use all the fields from vehicle that are made public to it...
    public int ifCar(){
    System.out.println("Do you want to buy a car?...\n1.Yes\n2.no");
        return inputObject.nextInt();
    }
}