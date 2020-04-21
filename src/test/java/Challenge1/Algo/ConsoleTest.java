package Challenge1.Algo;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ConsoleTest {

    @Test
    public void readIntegerFromStdin() {

        String input = "1";
        //richtige Eingabe
        assertEquals(1, Console.readIntegerFromStdin(input));

        String falscheParam = "One";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        System.setIn(in);

        try {
            //Fehler wurde hier genau erwartet => zuerst die Stdin als 1 definieren.
            int i = Console.readIntegerFromStdin(falscheParam);
            assertEquals(1, i);
        } catch (NoSuchElementException ex) {
            System.out.println("error");
        }
    }

    /*@Test
    public void readStringFromStdin() {

        String param = "One";
        assertEquals("One", Console.readStringFromStdin(param));

        String falscheParam = "1";
        Console.readIntegerFromStdin(falscheParam);
    }*/
}