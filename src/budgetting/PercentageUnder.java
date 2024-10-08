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
public class PercentageUnder implements Percentile{
    private String under75(){
        String message = "\nPlease note that you can get a car loan.\n";
        return message;
    }
    @Override
 public String ifPercentageOverSeventyFive(){
     return under75();
 }
}