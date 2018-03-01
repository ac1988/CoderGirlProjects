import java.util.Scanner;

import static java.lang.System.out;

public class MultiplicationTables {
    public static int getIntegerBetween(int lower, int upper){
        Scanner keyboard = new Scanner(System.in);
        int number;

        do {
            number = keyboard.nextInt();
            if(number < lower || number > upper){
                System.out.println("Error, invalid number. Please enter a number between 1-20.");
            }
        } while (number < lower || number > upper);
        return number;
    }

    public static void main (String[]args){
        int validatedNumber;

        out.println("Welcome to Multiplication Tables\n");
        out.print("How large would you like to see them? ");
        validatedNumber = getIntegerBetween(0, 20);

        for(int counter = 0; counter <= validatedNumber; counter ++){
            for (int secondCounter = 0; secondCounter <= validatedNumber; secondCounter ++) {
                out.println(counter + " * " + secondCounter + " = " + (counter * secondCounter));
            }
        }
    }
}
