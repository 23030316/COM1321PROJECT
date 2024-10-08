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
public class PercentageOver implements Percentile{
    private String over75(){
        String message = "\nPlease note that you cannot get a car loan.\n";
        return message;
    }
    @Override
 public String ifPercentageOverSeventyFive(){
     return over75();
 }
}
