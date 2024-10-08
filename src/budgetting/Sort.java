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
import java.util.ArrayList;

public class Sort{

public void Display(ArrayList<Double> contents) {
    System.out.println("\tHere is a list of all your expenses from highest to lowest.");
    int n = contents.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
        if (contents.get(j) < contents.get(j + 1)) {
            Double var = contents.get(j);
            contents.set(j, contents.get(j + 1));
            contents.set(j + 1, var);
        }
        }
    }
        for (Double allContents : contents) {
            String rounder = String.format("%.2f",allContents);
        System.out.println(rounder);
    }
}
}
