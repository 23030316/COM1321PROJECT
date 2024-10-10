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
        String message = "\nNote that your expenses are below 75% of your expenses\nthus your budget plan is on the right track.\n";
        return message;
    }
    @Override
 public String ifPercentageOverSeventyFive(){
     return under75();
 }
}
