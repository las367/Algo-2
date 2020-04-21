package Challenge1.Algo;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner in = new Scanner(System.in);

    public static int readIntegerFromStdin(String text) throws NumberFormatException {

        int i;

        try {
            i = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            return readIntegerFromStdin(readStringFromStdin("Please enter another number"));
        }

        return i;
    }

    public static String readStringFromStdin(String text) {

        System.out.println(text);
        String dataInput = in.nextLine();

        return dataInput;
    }

    //method to check if the number provided is negative
    private static int checkNegative(int num) {
        if (num <= 0) {
            return checkNegative(readIntegerFromStdin(readStringFromStdin("Please enter number bigger than 0")));
        } else {
            return num;
        }
    }

    private static int checkGreaterThanTwo(int num) {
        if (num <= 2) {
            return checkGreaterThanTwo(readIntegerFromStdin("Please enter a number bigger than two"));
        } else {
            return num;
        }
    }

    public static int[] askTwoInputs() {

        String xAsString = readStringFromStdin("Please enter a number for x");
        //ask integer from the user
        int x = readIntegerFromStdin(xAsString);
        //check if x negative
        int num1 = checkNegative(x);

        //same process above
        String yAsString = readStringFromStdin("Enter number for y:");
        int y = readIntegerFromStdin(yAsString);
        int num2 = checkNegative(y);

        return new int[]{num1, num2};
    }

    public static int askSingleInput() {

        String xAsString = readStringFromStdin("Please enter a number bigger than 2.");
        int x = readIntegerFromStdin(xAsString);
        int num = checkGreaterThanTwo(x);

        return num;
    }
}
