import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int soldForVeggies;
        int soldForBurgers;
        int soldForSubs;
        int soldForSoup;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today? ");
        soldForVeggies = keyboard.nextInt();
        keyboard.skip("\n");

        if(soldForVeggies >= goalForVeggies) {
            out.println("\nMade goal for veggies.");
        } else {
            out.println("\nFell short of goal for veggies.");
        {

        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        soldForBurgers = keyboard.nextInt();
        keyboard.skip("\n");

        if(soldForBurgers >= goalForBurgers) {
            out.println("\nMade goal for burgers.");
        } else {
            out.println("\nFell short of goal for burgers.");
        }

        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        soldForSubs = keyboard.nextInt();
        keyboard.skip("\n");

        if(soldForSubs >= goalForSubs) {
            out.println("\nMade goal for subs.");
        } else {
            out.println("\nFell short of goal for subs.");
        }

        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        soldForSoup = keyboard.nextInt();
        keyboard.skip("\n");

        if(soldForSoup >= goalForSoup) {
            out.println("\nMade goal for soup.");
        } else {
            out.println("\nFell short or goal for soup.");
        }

        if(soldForVeggies >= goalForVeggies && soldForBurgers >= goalForBurgers &&
                soldForSubs >= goalForSubs && soldForSoup >= goalForSoup) {
            out.println("\nMade goal for everything!");
        }
    }
}
