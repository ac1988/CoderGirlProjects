import static java.lang.System.err;
import static java.lang.System.out; import java.util.Scanner;

public class CatAndMouse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String option;
        String winningMessage = "You win!";
        String tryMessage = "Try again later.";
        String sadMessage = "The world's tiniest sad trombone plays at your mouse funeral";
        String errorMessage = "That was an invalid option.";

        out.println("You are a small, hungry field mouse.  You find yourself standing in a mouse hole " +
                "\nin the kitchen of a farm house.  In the room is a bowl of cat food that smells really tasty.  " +
                "\nA young cat is sleeping on a rug in the middle of the room.");
        out.println("\nLooking around the room, you see a wooden table with chairs, a metal floor lamp, " +
                "\nand curtains over a window.  You can smell a summer breeze blowing in.");

        out.println("\nWhere do you go? Options: chair table lamp food curtain ");
        option = keyboard.nextLine();

        if (option.equals("chair")){
            out.println("You sneak quietly to the chair and climb its rough wood.  The only place you can reach " +
                    "\nfrom here is the table, so you climb it too.  Looking around from the table, you see " +
                    "\ntwo paths. You can walk across the countertop to the open window, or you can climb down " +
                    "\nthe table leg to the floor. ");

            out.println("\nWhere do you go? Options: window floor");
            option = keyboard.nextLine();

            if (option.equals("window")) {
                out.println("You climb out the window and down.  The tall grass hides you well.  " +
                        "\nYou find some tasty spilled grain.  By the time you get to the barn, you are well fed, " +
                        "\nand ready to take a nap in the hay.  There is no cat in the barn.  " +
                        "\nYou're a happy mouse.  (The End)\n");
                out.println(winningMessage);
            } else if (option.equals("floor")) {
                out.println("You try to climb down the table leg but it's too slippery.  Thump! " +
                        "\nYou hit the floor with a bang.  The cat wakes up and chases you around the kitchen!  " +
                        "\nYou race back to your hole, still hungry, and hide for the rest of the day. (The End)\n");
                out.println(tryMessage);
            } else {
                out.println(errorMessage);
            }

        } else if (option.equals("table")) {
            out.println("You sneak quietly to the table.  The legs are polished and slippery, and you fall " +
                    "\nwith a thump when you try to climb up.  The cat woke up!  He chases you around the kitchen " +
                    "\nand back into the mouse hole!  Exhausted and hungry, you give up for the day.  (The End)\n");
            out.println(tryMessage);

        } else if (option.equals("lamp")) {
            out.println("You sneak quietly over to the lamp and try to climb it.  The lamp buzzes slightly " +
                    "\nunder your paws, and the light turns on with a click!  The cat heard the lamp turn on and " +
                    "\nsnaps awake.  He chases you around the kitchen and back into your hole!  (The End)\n");
            out.println(tryMessage);

        } else if (option.equals("food")) {
            out.println("You sneak over to the cat's food dish.  There's one piece of food on the floor and " +
                    "\nmore in the dish.  You're very hungry.");

            out.println("\nWhat do you eat?  Options: floor dish ");
            option = keyboard.nextLine();

            if (option.equals("floor")) {
                out.println("You eat a large, tasty piece of cat food that was dropped on the floor.  " +
                        "\nYou were very quiet.  The cat hasn't woken up yet.");

                out.println("\nWhere do you go next?  Options: dish curtain ");
                option = keyboard.nextLine();

                if (option.equals("dish")) {
                    out.println("The cat food rattles loudly as you climb into the cat food dish.  " +
                            "\nThe cat wakes up!  And he knows exactly where you are.  He's on you in an instant!  " +
                            "\nYou are lunch. :(  We'll be sure to notify your next of kin.  (The End)\n");
                    out.println(sadMessage);

                } else if (option.equals("curtain")) {
                    out.println("You quietly sneak over to the curtain.  The cat wakes up slow and groggy.  " +
                            "\nYou've already made it to the curtain by the time he notices you.  With a burst " +
                            "\nof well-fed strength, you race up the curtain and leap out the open window!  " +
                            "\nBehind you, you hear the thump of the cat hitting the window frame and not making " +
                            "\nit through. ");
                    out.println("\nYou follow a grain trail to the barn and find some warm hay to hide in for a " +
                            "\nnap. There is no cat in the barn.  You're a happy mouse!  (The End)\n");
                    out.println(winningMessage);
                } else {
                    out.println(errorMessage);
                }
            } else if (option.equals("dish")) {
                out.println("The cat food rattles loudly as you climb into the cat food dish.  The cat wakes up!  " +
                        "\nAnd he knows exactly where you are.  He's on you in an instant!  You are lunch. :(  " +
                        "\nWe'll be sure to notify your next of kin.  (The End)\n");
                out.println(sadMessage);
            } else {
                out.println(errorMessage);
            }

        } else if (option.equals("curtain")) {
            out.println("You sneak quietly across the room to the long curtains hanging by the window.  " +
                    "\nThe curtains are an easy climb.  The cat is still asleep.  You smell a barn just outside.");

            out.println("\nWhere do you go?  Options: down window ");
            option = keyboard.nextLine();

            if (option.equals("down")) {
                out.println("As you climb back down the curtain, the cat stretches and looks around the room.  " +
                        "\nHe notices the curtain hanging strangely and comes over to investigate.  You have " +
                        "\nbarely a moment to race back into your hole and try again tomorrow.  (The End)\n");
                out.println(tryMessage);

            } else if (option.equals("window")) {
                out.println("You smell a barn nearby with fresh grain.  You climb through the window and hide " +
                        "\nin the tall grass.  There's spilled grain here that makes a tasty treat.  By the time " +
                        "\nyou reach the barn, you are well fed, and find a quiet spot in the hay for a nap.  " +
                        "\nThere is no cat in the barn.  You're a happy mouse! (The End)\n");
                out.println(winningMessage);

            } else {
                out.println(errorMessage);
            }
        } else {
            out.println(errorMessage);
        }
    }
}