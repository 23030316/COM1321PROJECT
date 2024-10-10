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
        String message = "\nWARNING: Note that Your expenses exceed 75% of your gross income...\n";
        return message;
    }
    @Override
 public String ifPercentageOverSeventyFive(){
     return over75();
 }
}
