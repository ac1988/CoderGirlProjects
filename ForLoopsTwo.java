import java.util.Scanner;

import static java.lang.System.out;

public class ForLoopsTwo {
    public static String PrintBarChart(int number){
        for(int counter=1; counter <= number; counter++){
            out.print("#");
        }
        return "";
    }

    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int number;

        out.println("Welcome to Bar Chart");

        do {
            out.print("\nnumber? ");
            number = keyboard.nextInt();
            PrintBarChart(number);
        } while (number != 0);

        out.println("\nHave a good day!");
    }
}
