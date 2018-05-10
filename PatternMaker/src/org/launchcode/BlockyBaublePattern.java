package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class BlockyBaublePattern extends Pattern {
    public void pattern(){
        jamRate = 0.10d;

        Stitch circleStitch = new CircleStitch();
        Stitch shortLineStitch = new ShortLineStitch();
        Stitch blockStitch = new BlockStitch();

        //creates pattern combination of "[]--o--"
        setPatternCombination(new ArrayList<Stitch>(Arrays.asList(blockStitch, shortLineStitch, shortLineStitch,
                circleStitch, shortLineStitch, shortLineStitch)));

        ArrayList<Stitch> patternCombination = getPatternCombination();

        //loops through pattern combination of "[]--o--" three times to create "[]--o--[]--o--[]--o--"
        if(!isNeedleJam(jamRate)) {
            for (int c = 0; c < 3; c++) {
                for (int i = 0; i < 6; i++) {
                    patternCombination.get(i).sew();
                }
            }
        }

    }
}
