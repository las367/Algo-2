package Challenge1.Algo;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public static int readIntegerFromStdin(String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }

    public static String readStringFromStdin(String text) throws InputMismatchException {

        try {
            //check if text is convertible to integer:: check if text is number
            int temp = Integer.parseInt(text);
            throw new InputMismatchException();

        } catch (NumberFormatException e) {
            //if Number Format Exception is thrown,
            return text;
        }
    }

    public static int[] input() {

        int[] toReturn = new int[2];

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for x: ");
        toReturn[0] = readIntegerFromStdin(in.next());
        System.out.print("\nEnter number for y: ");
        toReturn[1] = readIntegerFromStdin(in.next());

        return toReturn;
    }
}
