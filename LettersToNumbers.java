import static java.lang.System.out;

public class LettersToNumbers {

    public static void main (String[] args) {
        int[] nums = {89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33};

        //prints secret message
        for (int index = 0; index < nums.length; index++) {
            out.print((char)nums[index]);
        }

        out.println();

        //prints ASCII values of message
        char[] chars = {'C','r', 'o', 'w', ' ', 'f', 'l', 'i', 'e', 's', ' ', 'a', 't', ' ',
                    'd', 'a', 'w', 'n'};
        for (int index = 0; index < chars.length; index++) {
            out.print((int)chars[index] + ", ");
        }
    }
}
