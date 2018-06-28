import static java.lang.System.out;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String weather;
        String mood;

        out.println("What is the weather like today? Answer: sunny, cloudy or rainy.");
        weather = keyboard.nextLine();

        out.println("What kind of mood are you in for activities? Answer: exercise, party, or quiet.");
        mood = keyboard.nextLine();

        if (weather.equals("sunny")) {
            if (mood.equals("exercise")) {
                out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
            } else if (mood.equals("party")) {
                out.println("For a fun party on a sunny day, look for a street festival.");
            } else if (mood.equals("quiet")) {
                out.println("A sunny day is a beautiful time to sit under a tree and read a book.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }
        } else if (weather.equals("cloudy")) {
            if (mood.equals("exercise")) {
                out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
            } else if (mood.equals("party")) {
                out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
            } else if (mood.equals("quiet")) {
                out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }
        } else if (weather.equals("rainy")) {
            if (mood.equals("exercise")) {
                out.println("Giant indoor trampolines are a fun place to exercise on a rainy day.");
            } else if (mood.equals("party")) {
                out.println("See if your friends are playing board games to pass a rainy day.");
            } else if (mood.equals("quiet")) {
                out.println("A rainy day is a peaceful time to journal and daydream.");
            } else {
                out.println("Error: Your mood answer wasn't one of the valid options.");
            }
        } else {
            out.println("Error: Your weather answer wasn't one of the valid options.");
        }
    }
}
