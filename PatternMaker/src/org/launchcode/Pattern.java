package org.launchcode;

import java.util.ArrayList;

public class Pattern extends Stitch{
    public static double jamRate;
    private ArrayList<Stitch> patternCombination = new ArrayList<Stitch>();

    public Pattern(){
    }

    public Pattern(ArrayList<Stitch> patternCombination){
        this.patternCombination = patternCombination;
    }

    public ArrayList<Stitch> getPatternCombination(){
        return patternCombination;
    }

    public void setPatternCombination(ArrayList<Stitch> patternCombination){
        this.patternCombination = patternCombination;
    }

    public void pattern(){
        for(int i=0; i < patternCombination.size(); i++){
            System.out.print(patternCombination.get(i));
        }
    }

    public static boolean isNeedleJam(double jamRate){
        boolean needleJam = (Math.random() < jamRate);
        return needleJam;
    }
}
