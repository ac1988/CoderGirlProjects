package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class BaublePattern extends Pattern {
    public void pattern(){
        Stitch circleStitch = new CircleStitch();
        Stitch shortLineStitch = new ShortLineStitch();

        //creates pattern combination of "--o"
        setPatternCombination(new ArrayList<Stitch>(Arrays.asList(shortLineStitch, shortLineStitch, circleStitch)));

        ArrayList<Stitch> patternCombination = getPatternCombination();

        //loops through pattern combination of "--o" five times to create "--o--o--o--o--o"
        for (int c = 0; c < 5; c++) {
            for (int i = 0; i < 3; i++) {
                patternCombination.get(i).sew();
            }
        }
    }
}
