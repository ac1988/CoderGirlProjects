package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TapestryController {

    public static void main(String[] args) {
        Pattern crossStitchWigglePattern = new CrossStitchWigglePattern();
        Pattern zigZagLinesPattern = new ZigZagLinesPattern();
        Pattern baublePattern = new BaublePattern();
        Pattern blockyBaublePattern = new BlockyBaublePattern();
        Pattern brokenWigglePattern = new BrokenWigglePattern();

        //creates an ArrayList of all of the patterns
        ArrayList<Pattern> patternArrayList = new ArrayList<Pattern>(Arrays.asList(crossStitchWigglePattern,
                zigZagLinesPattern, baublePattern, blockyBaublePattern, brokenWigglePattern));

        System.out.println("Patterns printed 8 blocks wide and 3 rows tall\n");

        //loops through the ArrayList of patterns and prints them 8 blocks wide and 3 rows tall
        for(int i=0; i < patternArrayList.size(); i++) {
            for (int row = 0; row < 3; row++) {
                patternArrayList.get(i).pattern();
                for (int column = 0; column < 7; column++) {
                    patternArrayList.get(i).pattern();
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

        System.out.println("Patterns printed 6 blocks wide and 8 rows tall\n");

        //loops through the ArrayList of patterns and prints them 6 blocks wide and 8 rows tall
        for(int i=0; i < patternArrayList.size(); i++) {
            for (int row = 0; row < 8; row++) {
                patternArrayList.get(i).pattern();
                for (int column = 0; column < 5; column++) {
                    patternArrayList.get(i).pattern();
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }
}
