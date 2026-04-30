////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075522
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {

  private static final Map<Character, String[]> LETTERS = new HashMap<>();

  static {
    LETTERS.put('I', new String[]{
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    });

    LETTERS.put('V', new String[]{
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    });

    LETTERS.put('X', new String[]{
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    });

    LETTERS.put('L', new String[]{
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    });

    LETTERS.put('C', new String[]{
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    });

    LETTERS.put('D', new String[]{
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    });

    LETTERS.put('M', new String[]{
        " __  __",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    });
  }

  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) {
    StringBuilder[] rows = new StringBuilder[6];

    for (int i = 0; i < 6; i++) {
      rows[i] = new StringBuilder();
    }

    for (char c : romanNumber.toCharArray()) {
      String[] asciiLetter = LETTERS.get(c);

      for (int i = 0; i < 6; i++) {
        rows[i].append(asciiLetter[i]);
      }
    }

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 6; i++) {
      result.append(rows[i]);
      if (i < 5) {
        result.append(System.lineSeparator());
      }
    }

    return result.toString();
  }
}
