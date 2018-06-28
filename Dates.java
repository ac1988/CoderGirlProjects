public class Dates  {     // --- add methods here to make the program work ---

    public static String formatNumberAsTwoDigits(int number)
    {
        String numberToString = Integer.toString(number);
        if (numberToString.length() < 2) {
            return "0" + numberToString;
        } else {
            return numberToString;
        }
    }

    public static String nameFormat(int year, int month, int day)
    {
        if (month == 1) {
            return "January " + day + ", " + year;
        } else if (month == 2) {
            return  "February " + day + ", " + year;
        } else if (month == 3) {
            return "March " + day + ", " + year;
        } else if (month ==4) {
            return "April " + day + ", " + year;
        } else if (month == 5) {
            return  "May " + day + ", " + year;
        } else if (month == 6) {
            return "June " + day + ", " + year;
        } else if (month == 7) {
            return "July " + day + ", " + year;
        } else if (month == 8) {
            return "August " + day + ", " + year;
        } else if (month == 9) {
            return "September " + day + ", " + year;
        } else if (month == 10) {
            return "October " + day + ", " + year;
        } else if (month == 11) {
            return "November " + day + ", " + year;
        } else if (month == 12) {
            return "December " + day + ", " + year;
        } else {
            return "Date is not valid";
        }
    }

    public static String slashFormat(int year, int month, int day)
    {
        String formattedYear = formatNumberAsTwoDigits(year);
        String formattedMonth = formatNumberAsTwoDigits(month);
        String formattedDay = formatNumberAsTwoDigits(day);

        return formattedMonth + "/" + formattedDay + "/" + formattedYear;
    }

    public static String dashFormat(int year, int month, int day)
    {
        String formattedYear = formatNumberAsTwoDigits(year);
        String formattedMonth = formatNumberAsTwoDigits(month);
        String formattedDay = formatNumberAsTwoDigits(day);

        return formattedYear + "-" + formattedMonth + "-" + formattedDay;
    }

    // ---- end of your work area -----

    // don't change this code.
    public static void printDate(int year, int month, int day)
    {
        System.out.println(nameFormat(year, month, day));
        System.out.println(slashFormat(year, month, day));
        System.out.println(dashFormat(year, month, day));
        System.out.println();
    }

    // don't change this code.
    public static void main(String[] args)
    {
        System.out.println(formatNumberAsTwoDigits(3));
        System.out.println(formatNumberAsTwoDigits(9));
        System.out.println(formatNumberAsTwoDigits(10));
        System.out.println(formatNumberAsTwoDigits(12));

        printDate(2014, 10, 4);
        printDate(2015, 1, 1);
        printDate(2013, 12, 31);
    }
}
