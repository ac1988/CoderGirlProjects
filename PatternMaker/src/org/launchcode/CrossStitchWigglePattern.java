package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class CrossStitchWigglePattern extends Pattern {

    public void pattern(){
        jamRate = 0.05d;

        Stitch smallCrossStitch = new SmallCrossStitch();
        Stitch largeCrossStitch = new LargeCrossStitch();

        //creates pattern combination of "xX"
        setPatternCombination(new ArrayList<Stitch>(Arrays.asList(smallCrossStitch, largeCrossStitch)));

        ArrayList<Stitch> patternCombination = getPatternCombination();

        //loops through pattern combination of "xX" five times to create "xXxXxXxXxX"
        if(!isNeedleJam(jamRate)){
            for (int c = 0; c < 5; c++) {
                for (int i = 0; i < 2; i++) {
                    patternCombination.get(i).sew();
                }
            }
        }

    }
}
