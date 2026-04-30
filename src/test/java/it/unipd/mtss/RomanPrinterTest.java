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
@Test
    public void shouldPrint4AsAsciiArt() {
        String expected =
            " _____ __      __\n" +
            "|_   _|\\ \\    / /\n" +
            "  | |   \\ \\  / / \n" +
            "  | |    \\ \\/ /  \n" +
            " _| |_    \\  /   \n" +
            "|_____|    \\/    ";

        String result = RomanPrinter.print(4);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint5AsAsciiArt() {
        String expected =
            "__      __\n" +
            "\\ \\    / /\n" +
            " \\ \\  / / \n" +
            "  \\ \\/ /  \n" +
            "   \\  /   \n" +
            "    \\/    ";

        String result = RomanPrinter.print(5);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint6AsAsciiArt() {
        String expected =
              "__      __ _____ \n" +
            "\\ \\    / /|_   _|\n" +
            " \\ \\  / /   | |  \n" +
            "  \\ \\/ /    | |  \n" +
             "   \\  /    _| |_ \n" +
             "    \\/    |_____|";

        String result = RomanPrinter.print(6);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint7AsAsciiArt() {
        String expected =
              "__      __ _____  _____ \n" +
            "\\ \\    / /|_   _||_   _|\n" +
            " \\ \\  / /   | |    | |  \n" +
            "  \\ \\/ /    | |    | |  \n" +
             "   \\  /    _| |_  _| |_ \n" +
             "    \\/    |_____||_____|";

        String result = RomanPrinter.print(7);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint8AsAsciiArt() {
        String expected =
              "__      __ _____  _____  _____ \n" +
            "\\ \\    / /|_   _||_   _||_   _|\n" +
            " \\ \\  / /   | |    | |    | |  \n" +
            "  \\ \\/ /    | |    | |    | |  \n" +
             "   \\  /    _| |_  _| |_  _| |_ \n" +
             "    \\/    |_____||_____||_____|";

        assertEquals(expected, RomanPrinter.print(8));
    }

    @Test
    public void shouldPrint9AsAsciiArt() {
        String expected =
            " _____ __   __\n" +
            "|_   _|\\ \\ / /\n" +
            "  | |   \\ V / \n" +
            "  | |    > <  \n" +
            " _| |_  / . \\ \n" +
            "|_____|/_/ \\_\\";

        String result = RomanPrinter.print(9);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint10AsAsciiArt() {
        String expected =
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  > <  \n" +
            " / . \\ \n" +
            "/_/ \\_\\";

        String result = RomanPrinter.print(10);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint20AsAsciiArt() {
        String expected =
            "__   ____   __\n" +
            "\\ \\ / /\\ \\ / /\n" +
            " \\ V /  \\ V / \n" +
            "  > <    > <  \n" +
            " / . \\  / . \\ \n" +
            "/_/ \\_\\/_/ \\_\\";

        String result = RomanPrinter.print(20);

        assertEquals(expected, result);
    }

    @Test
    public void shouldPrint50AsAsciiArt() {
        String expected =
            " _      \n" +
            "| |     \n" +
            "| |     \n" +
            "| |     \n" +
            "| |____ \n" +
            "|______|";

        String result = RomanPrinter.print(50);

        assertEquals(expected, result);
    }
}
