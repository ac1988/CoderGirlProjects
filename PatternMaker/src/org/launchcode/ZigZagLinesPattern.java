package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ZigZagLinesPattern extends Pattern {
    public void pattern(){
        Stitch zigZagStitch = new ZigZagStitch();
        Stitch fillStitch = new FillStitch();

        //creates pattern combination of "ZZZ==="
        setPatternCombination(new ArrayList<Stitch>(Arrays.asList(zigZagStitch, zigZagStitch, zigZagStitch,
                fillStitch, fillStitch, fillStitch)));

        ArrayList<Stitch> patternCombination = getPatternCombination();

        //loops through pattern combination of "ZZZ===" two times to create "ZZZ===ZZZ==="
        for(int c=0; c < 2; c++){
            for(int i=0; i < 6; i++) {
                patternCombination.get(i).sew();
            }
        }

    }
}
