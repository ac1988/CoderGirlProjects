import static java.lang.System.out; import java.util.Scanner;

public class CountToTen  {

    public static String getEnglishWord(int number)
    {
        // zero one two three four five six seven eight nine ten
        if (number == 0) {
            return "zero";
        } else if (number == 1) {
            return "one";
        } else if (number == 2) {
            return "two";
        } else if (number == 3) {
            return "three";
        } else if (number == 4) {
            return "four";
        } else if (number == 5) {
            return "five";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "seven";
        } else if (number == 8) {
            return "eight";
        } else if (number == 9) {
            return "nine";
        } else if (number == 10) {
            return "ten";
        }
        return "Fix me";
    }

    public static String getSpanishWord(int number)
    {
        // cero uno dos tres cuatro cinco seis siete ocho nueve diez
        if (number == 0) {
            return "cero";
        } else if (number == 1) {
            return "uno";
        } else if (number == 2) {
            return "dos";
        } else if (number == 3) {
            return "tres";
        } else if (number == 4) {
            return "cuatro";
        } else if (number == 5) {
            return "cinco";
        } else if (number == 6) {
            return "seis";
        } else if (number == 7) {
            return "siete";
        } else if (number == 8) {
            return "ocho";
        } else if (number == 9) {
            return "nueve";
        } else if (number == 10) {
            return "diez";
        }
        return "Fix me";
    }

    public static String getFrenchWord(int number)
    {
        // cero uno dos tres cuatro cinco seis siete ocho nueve diez
        if (number == 0) {
            return "zéro";
        } else if (number == 1) {
            return "un";
        } else if (number == 2) {
            return "duex";
        } else if (number == 3) {
            return "trois";
        } else if (number == 4) {
            return "quatre";
        } else if (number == 5) {
            return "cinq";
        } else if (number == 6) {
            return "six";
        } else if (number == 7) {
            return "sept";
        } else if (number == 8) {
            return "huit";
        } else if (number == 9) {
            return "neuf";
        } else if (number == 10) {
            return "dix";
        }
        return "Fix me";
    }

    public static String getWord(String language, int number)
    {
        if (number < 0) {
            return "Number too small.";
        }
        if (number > 10) {
            return "Number too large.";
        }
        if ("e".equals(language)) {
            return getEnglishWord(number);
        }
        if ("s".equals(language)) {
            return getSpanishWord(number);
        }
        if ("f".equals(language)) {
            return getFrenchWord(number);
        }
        return "Unrecognized language choice.";
    }

    public static void main(String[] args)
    {
        System.out.println("Would you like English, Spanish or French?");
        System.out.println("Press e, s, or f");
        Scanner keyboard = new Scanner(System.in);
        String language = keyboard.nextLine();

        System.out.println("What number do you want the name of? 0-10");
        int number = keyboard.nextInt();
        keyboard.skip("\n");
        String spelled_out = getWord(language, number);

        if (spelled_out.equals("Number too small.") || spelled_out.equals("Number too large.")) {
            System.out.println(spelled_out);
        } else {
            System.out.println("The word for " + number + " is " + spelled_out);
        }
    }
}