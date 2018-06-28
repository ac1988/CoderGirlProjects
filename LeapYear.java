import static java.lang.System.out;

public class LeapYear {

    public static boolean isLeapYear(int year)
    {
        if((year % 4 == 0) && (year % 100 !=0))
        {
            return true;
        } else if ((year % 100 == 0) && (year % 400 == 0)){
            return true;
        }
        return false;
    }

    public static void main (String[] args)
    {
        out.println("Testing your functions.");
        int testFailures = 0;

        if(isLeapYear(1600) == false)
        {
            out.println("Error 1: isLeapYear failed test. Expected true, got " + isLeapYear(1600));
            testFailures++;
        }
        if(isLeapYear(2000) == false) {
            out.println("Error 2: isLeapYear failed test. Expected true, got " + isLeapYear(2000));
            testFailures++;
        }
        if(isLeapYear(2400) == false) {
            out.println("Error 3: isLeapYear failed test. Expected true, got " + isLeapYear(2400));
            testFailures++;
        }
        if(isLeapYear(1988) == false) {
            out.println("Error 4: isLeapYear failed test. Expected true, got " + isLeapYear(1988));
            testFailures++;
        }
        if(isLeapYear(1996) == false) {
            out.println("Error 5: isLeapYear failed test. Expected true, got " + isLeapYear(1996));
            testFailures++;
        }
        if(isLeapYear(2004) == false) {
            out.println("Error 6: isLeapYear failed test. Expected true, got " + isLeapYear(2004));
            testFailures++;
        }
        if(isLeapYear(4000) == false) {
            out.println("Error 7: isLeapYear failed test. Expected true, got " + isLeapYear(4000));
            testFailures++;
        }
        if(isLeapYear(1800) == true) {
            out.println("Error 8: isLeapYear failed test. Expected false, got " + isLeapYear(1800));
            testFailures++;
        }
        if(isLeapYear(1900) == true) {
            out.println("Error 9: isLeapYear failed test. Expected false, got " + isLeapYear(1900));
            testFailures++;
        }
        if(isLeapYear(2200) == true) {
            out.println("Error 10: isLeapYear failed test. Expected false, got " + isLeapYear(2200));
            testFailures++;
        }
        if(isLeapYear(1987) == true) {
            out.println("Error 11: isLeapYear failed test. Expected false, got " + isLeapYear(1987));
            testFailures++;
        }
        if(isLeapYear(1999) == true) {
            out.println("Error 12: isLeapYear failed test. Expected false, got " + isLeapYear(1999));
            testFailures++;
        }
        if(isLeapYear(2006) == true) {
            out.println("Error 13: isLeapYear failed test. Expected false, got " + isLeapYear(2006));
            testFailures++;
        }

        if (testFailures == 0) {
            out.println("Success!  All test cases passed.");
        } else {
            out.println(testFailures + " tests failed.  Keep trying!");
        }
    }
}
