import static java.lang.System.out;

public class HiddenMessageParseInt {
    public static void main (String[]args){
            int[] numbers = {100, 101, 102, 103, 104, 105, 106, 107, 110, 111, 112, 113, 114, 115, 116,
                    117, 120, 121, 122, 123, 124, 125, 126, 127, 130, 131, 132, 133, 134};
            char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                    'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', '?'};
            String[] binaryString = {"1110010", "1101000", "1101000", "1111011", "10000100", "1100100", "1111011",
                    "10000100", "1111011", "1101011", "1101000", "10000100", "1111011", "1101011", "1101000", "1100100",
                    "1111011", "1101000", "1111001", "10000100", "1100100", "1111011", "10000100", "1110011",
                    "1101110", "1110011", "1101000", "10000100", "1110101", "1110010", "10000101"};

            for(int index = 0; index < binaryString.length; index++) {
                for (int x = 0; x < numbers.length; x++) {
                    if (Integer.parseInt(binaryString[index], 2) == numbers[x]) {
                        out.print(chars[x]);
                    }
                }
            }
    }
}



