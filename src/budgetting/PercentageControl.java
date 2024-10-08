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
public class PercentageControl implements Percentile{
    Percentile SevenFive;
    
    public PercentageControl(Percentile SevenFive){
    this.SevenFive = SevenFive;
    }
    @Override
 public String ifPercentageOverSeventyFive(){
    return this.SevenFive.ifPercentageOverSeventyFive();
 }
 public void ShowOption(){
 String text = ifPercentageOverSeventyFive();
 System.out.println(text);
 }
}