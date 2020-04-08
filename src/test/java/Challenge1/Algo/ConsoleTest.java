package Challenge1.Algo;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsoleTest {

    Console console = new Console();
    Scanner in = new Scanner(System.in);

    @Test
    public void readIntegerFromStdin() {

        try {
            //simulating System.in
            String data = "1";
            int num = console.readIntegerFromStdin(data);
        } catch (NumberFormatException e) {
            readStringFromStdin();
        }
    }

    @Test
    public void readStringFromStdin() {

        try {
            //simulating System.in
            String data = "Mustermann";
            String text = console.readStringFromStdin(data);
        } catch (InputMismatchException e) {
            readStringFromStdin();
        }
    }
}