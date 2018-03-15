public class Temperatures {
    public static void main(String[] args) {
        int[][] temps = new int[4][7];
        String[] times = {"7 AM: ", "3 PM: ", "7 PM: ", "3 AM: "};
        String[] days = {"Sun: ", "Mon: ", "Tue: ", "Wed: ", "Thu: ", "Fri: ", "Sat: "};
        int totalWeeklySum = 0;
        int weeklyAvg;

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;

        System.out.println("Temperature Calculator\n");
        System.out.println("The data values provided are:");

        //temps.length = 4 (total rows)
        //temps[0].length = 7 (total column)

        //prints table
        for (int row = 0; row < temps.length; row++) {
            System.out.print(times[row]);
            for (int column = 0; column < temps[0].length; column++) {
                System.out.print(temps[row][column] + " ");
            }
            System.out.println();
        }

        System.out.println("\nBased on that data, the following are the average temperatures for the week.\n");

        //calculates and prints daily average temps
        for(int column = 0; column < temps[0].length; column++) {
            int sum = 0;
            int dailyAvg = 0;
            for (int row = 0; row < temps.length; row++) {
                sum += temps[row][column];
            }
            dailyAvg = sum / temps.length;
            System.out.println(days[column] + dailyAvg);
        }

        System.out.println();

        //calculates and prints time of day averages
        for (int row = 0; row < temps.length; row++) {
            int sum = 0;
            int timeOfDayAvg = 0;
            for (int column = 0; column < temps[0].length; column++) {
                sum += temps[row][column];
            }
            timeOfDayAvg = sum / temps[0].length;
            System.out.println(times[row] + timeOfDayAvg);
        }

        //calculates weekly average temp
        for (int row = 0; row < temps.length; row++) {
            for (int column = 0; column < temps[0].length; column++) {
                totalWeeklySum += temps[row][column];
            }
        }
        weeklyAvg = totalWeeklySum / (temps.length * temps[0].length);

        System.out.println("\nThe final average temperature for the week was:");
        System.out.println("\nOverall: " + weeklyAvg);
    }
}

