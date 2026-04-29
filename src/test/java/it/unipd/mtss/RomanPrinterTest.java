////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075522
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void shouldPrint1AsAsciiArt() {
        String expected =
                " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|";

        String result = RomanPrinter.print(1);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint2AsAsciiArt() {
        String expected =
                " _____  _____ \n" +
                "|_   _||_   _|\n" +
                "  | |    | |  \n" +
                "  | |    | |  \n" +
                " _| |_  _| |_ \n" +
                "|_____||_____|";

        String result = RomanPrinter.print(2);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint3AsAsciiArt() {
        String expected =
                " _____  _____  _____ \n" +
                "|_   _||_   _||_   _|\n" +
                "  | |    | |    | |  \n" +
                "  | |    | |    | |  \n" +
                " _| |_  _| |_  _| |_ \n" +
                "|_____||_____||_____|";

        String result = RomanPrinter.print(3);

        assertEquals(expected, result);
    }
}