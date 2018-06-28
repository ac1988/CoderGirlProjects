import static java.lang.System.out;

public class NumberArrays {
    public static void main(String[] args){
        int[] firstWeekTemps = {65, 68, 72, 83, 73, 66, 85};
        int[] secondWeekTemps = {86, 87, 85, 78, 79, 78, 80};
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int firstWeekSum = 0;
        int secondWeekSum = 0;
        int warmestTempWeekOne = 0;
        int warmestTempWeekTwo = 0;
        String warmestDayWeekOne = "";
        String warmestDayWeekTwo = "";

        out.println("Week 1 High Temperatures");

        //prints week one temps & determine warmest day
        for(int index=0; index < firstWeekTemps.length; index++){
            if (firstWeekTemps[index] > warmestTempWeekOne) {
                warmestTempWeekOne = firstWeekTemps[index];
                warmestDayWeekOne = day[index];
            }
            if(index == firstWeekTemps.length - 1){
                out.print(firstWeekTemps[index]);
                out.println();
            } else {
                out.print(firstWeekTemps[index] + ", ");
            }
        }

        out.println();
        out.println("Week 2 High Temperatures");

        //prints week 2 temps & determine warmest day
        for(int index=0; index < secondWeekTemps.length; index++) {
            if (secondWeekTemps[index] > warmestTempWeekTwo) {
                warmestTempWeekTwo = secondWeekTemps[index];
                warmestDayWeekTwo = day[index];
            }
            if (index == secondWeekTemps.length - 1) {
                out.println(secondWeekTemps[index]);
                out.println();
            } else {
                out.print(secondWeekTemps[index] + ", ");
            }
        }

        //calculates averages for week one and two
        for(int index=0; index < firstWeekTemps.length; index++){
            firstWeekSum += firstWeekTemps[index];
            secondWeekSum += secondWeekTemps[index];
        }
        int firstWeekAverage = firstWeekSum/firstWeekTemps.length;
        int secondWeekAverage = secondWeekSum/secondWeekTemps.length;

        out.println("The average daily high temperature for week 1 is " + firstWeekAverage + ".");
        out.println("The average daily high temperature for week 2 is " + secondWeekAverage + ".");

        out.println("In week 1, " + warmestDayWeekOne + " was the warmest, at " +
                warmestTempWeekOne + " degrees." );
        out.println("In week 2, " + warmestDayWeekTwo + " was the warmest, at " +
                warmestTempWeekTwo + " degrees.");

    }
}
