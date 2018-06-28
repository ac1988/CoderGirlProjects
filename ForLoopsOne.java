import java.util.Scanner;

import static java.lang.System.out;

public class ForLoopsOne {
    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);
        int number;
        out.println("How big of a number should I count to?");
        number = keyboard.nextInt();

        for(int counter=1; counter <= number; counter++){
            out.print(counter + " ");
        }

        out.println();

        for(int counter=number; counter >= 1; counter--){
            out.print(counter + " ");
        }
    }
}
