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
            System.out.println("Please enter another number");
            return readIntegerFromStdin(askInput());
        }

        return i;
    }

    public static String readStringFromStdin(String text) throws InputMismatchException {

        try {
            //check if text is convertible to integer:: check if text is number
            int temp = Integer.parseInt(text);
            System.out.println("Please enter another number");
            return readStringFromStdin(askInput());

        } catch (NumberFormatException e) {
            //if Number Format Exception is thrown,
            return text;
        }
    }

    //Method to ask input from the user using console
    public static String askInput() {

        String toRet;

        try {
            toRet = in.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
            return askInput();
        }

        return toRet;
    }

    //method to check if the number provided is negative
    private static int checkNegative(int num) {
        if (num <= 0) {
            System.out.println("Please enter number bigger than 0");
            return checkNegative(readIntegerFromStdin(askInput()));
        } else {
            return num;
        }
    }

    private static int checkGreaterThanTwo(int num) {
        if (num <= 2) {
            System.out.println("Please enter number bigger than two");
            return checkGreaterThanTwo(readIntegerFromStdin(askInput()));
        } else {
            return num;
        }
    }

    public static int[] askTwoInputs() {

        System.out.println("Enter number for x:");
        //ask integer from the user
        int x = readIntegerFromStdin(askInput());
        //check if x negative
        int num1 = checkNegative(x);

        System.out.println("Enter number for y:");
        //same process above
        int y = readIntegerFromStdin(askInput());
        int num2 = checkNegative(y);

        return new int[]{num1, num2};
    }

    public static int askSingleInput() {

        System.out.println("Please enter a number bigger than 2.");

        int x = readIntegerFromStdin(askInput());
        int num = checkGreaterThanTwo(x);

        return num;
    }
}
