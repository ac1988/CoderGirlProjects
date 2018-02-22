import java.util.Scanner;

import static java.lang.System.out;

public class MailMerge {
    public static void main (String[]args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        float donation;
        boolean keepGoing = true;

        out.println("----Thank You Letters----\n");

        while(keepGoing){
            out.println("What is the donor's first and last name? (if done, type quit)");
            name = keyboard.nextLine();

            if(name.equals("quit")){
                keepGoing = false;
            } else {
                out.println("What was the donation amount?");
                donation = keyboard.nextFloat();
                keyboard.skip("\n");

                out.println("Dear " + name + ",");
                out.println("\nThank you for your donation!  We rely on donors like you to keep our ");
                out.println("organization effective, and you came through for us.  Your donation of $" + donation);
                out.println("will help our efforts to make a difference in the world.");
                out.println("\nAs you may know, we are a registered non-profit organization, so your ");
                out.println("donation is tax deductible.  You may use this letter as a receipt for tax ");
                out.println("purposes.");
                out.println("\nThank you again for your support!");
                out.println("\nSincerely,");
                out.println("Paula Jones");
                out.println("YourCharity.org\n");
            }
        }
    }
}
