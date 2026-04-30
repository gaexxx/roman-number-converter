////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075521
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

public class MainTest {

  @Test
  public void shouldReadInputAndPrintRomanAsciiArt() {
    InputStream originalIn = System.in;
    PrintStream originalOut = System.out;

    ByteArrayInputStream inputStream =
        new ByteArrayInputStream("5\n".getBytes());
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    try {
      System.setIn(inputStream);
      System.setOut(new PrintStream(outputStream));

      Main.main(new String[]{});

      String output = outputStream.toString();
      assertTrue(output.contains("Inserisci un numero (1-1000):"));
      assertTrue(output.contains(RomanPrinter.print(5)));

    } finally {
      System.setIn(originalIn);
      System.setOut(originalOut);
    }
  }
}