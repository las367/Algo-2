package Challenge1.Algo;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsoleTest {

    @Test
    public void readIntegerFromStdin() {

        String param = "1";
        //richtige Eingabe
        assertEquals(1, Console.readIntegerFromStdin(param));

        String falscheParam = "One";
        Console.readStringFromStdin(falscheParam);
    }

    @Test
    public void readStringFromStdin() {

        String param = "One";
        assertEquals("One", Console.readStringFromStdin(param));

        String falscheParam = "1";
        Console.readIntegerFromStdin(falscheParam);
    }
}