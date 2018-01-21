import java.util.Scanner;

import static java.lang.System.out;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String firstItem;
        out.println("Please list three items on your grocery list.");
        out.print("Item 1? ");
        firstItem = keyboard.nextLine();

        String secondItem;
        out.print("\nItem 2? ");
        secondItem = keyboard.nextLine();

        String thirdItem;
        out.print("\nItem 3? ");
        thirdItem = keyboard.nextLine();

        int firstItemQuantity;
        out.println("\nNow, please entry the quantity of each item.");
        out.print("How many " + firstItem + "? ");
        firstItemQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        int secondItemQuantity;
        out.print("\nHow many " + secondItem + "? ");
        secondItemQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        int thirdItemQuantity;
        out.print("\nHow many " + thirdItem + "? ");
        thirdItemQuantity = keyboard.nextInt();
        keyboard.skip("\n");

        float firstItemCost;
        out.println("\nNow, please enter the price of each item.");
        out.print("How much does one " + firstItem + " cost? ");
        firstItemCost = keyboard.nextFloat();
        keyboard.skip("\n");

        float secondItemCost;
        out.print("\nHow much does one " + secondItem + " cost? ");
        secondItemCost = keyboard.nextFloat();
        keyboard.skip("\n");

        float thirdItemCost;
        out.print("\nHow much does one " + thirdItem + " cost? ");
        thirdItemCost = keyboard.nextFloat();
        keyboard.skip("\n");

        float totalGroceryBill;
        totalGroceryBill = (firstItemCost * firstItemQuantity) +
                (secondItemCost * secondItemQuantity) +
                (thirdItemCost * thirdItemQuantity);
        out.println("\nCalculating your grocery bill.");
        out.print("Your total cost is " + totalGroceryBill);
    }
}
