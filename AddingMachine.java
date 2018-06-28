import java.util.Scanner;

import static java.lang.System.out;

public class AddingMachine {

    public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        float amount = 0;
        float subtotal = 0;
        int counter = 0;
        boolean keepGoing = true;

        out.println("Welcome to Adding Machine!");

        while(keepGoing){
            out.println("Total: " + subtotal);
            out.print("\nAdd: ");
            amount = keyboard.nextFloat();
            keyboard.skip("\n");
            subtotal = subtotal + amount;
            if(amount == 0){
                keepGoing = false;
            } else {
                counter++;
            }
        }
        out.println("\nYou entered " + counter + " numbers, for a final total of " + subtotal + ".");

    }
}
