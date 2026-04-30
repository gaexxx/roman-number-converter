////////////////////////////////////////////////////////////////////
// Gaetano Spagnoli 2147977
// Ruben Spadiliero 2075522
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void shouldConvert1ToI() {
        int number = 1;

        String result = IntegerToRoman.convert(number);

        assertEquals("I", result);
    }

    @Test
    public void shouldConvert2ToII() {
        int number = 2;

        String result = IntegerToRoman.convert(number);

        assertEquals("II", result);
    }

    @Test
    public void shouldConvert3ToIII() {
        int number = 3;

        String result = IntegerToRoman.convert(number);

        assertEquals("III", result);
    }

@Test
    public void shouldConvert4ToIV() {
        int number = 4;

        String result = IntegerToRoman.convert(number);

        assertEquals("IV", result);
    }

    @Test
    public void shouldConvert5ToV() {
        int number = 5;

        String result = IntegerToRoman.convert(number);

        assertEquals("V", result);
    }

    @Test
    public void shouldConvert6ToVI() {
        int number = 6;

        String result = IntegerToRoman.convert(number);

        assertEquals("VI", result);
    }

    @Test
    public void shouldConvert7ToVII() {
        int number = 7;

        String result = IntegerToRoman.convert(number);

        assertEquals("VII", result);
    }

    @Test
    public void shouldConvert8ToVIII() {
        int number = 8;

        String result = IntegerToRoman.convert(number);

        assertEquals("VIII", result);
    }

    @Test
    public void shouldConvert9ToIX() {
        int number = 9;

        String result = IntegerToRoman.convert(number);

        assertEquals("IX", result);
    }

    @Test
    public void shouldConvert10ToX() {
        int number = 10;

        String result = IntegerToRoman.convert(number);

        assertEquals("X", result);
    }

    @Test
    public void shouldConvertFirstTwentyNumbersToRoman() {
        String[] expected = {
            "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV",
            "XVI", "XVII", "XVIII", "XIX", "XX"
        };

        for (int i = 1; i <= 20; i++) {
            assertEquals(expected[i - 1], IntegerToRoman.convert(i));
        }
    }    

    // test mirati sui casi importanti del range 21..50
    @Test
    public void shouldConvert24ToXXIV() {
        int number = 24;

        String result = IntegerToRoman.convert(number);

        assertEquals("XXIV", result);
    }

    @Test
    public void shouldConvert29ToXXIX() {
        int number = 29;

        String result = IntegerToRoman.convert(number);

        assertEquals("XXIX", result);
    }

    @Test
    public void shouldConvert30ToXXX() {
        int number = 30;

        String result = IntegerToRoman.convert(number);

        assertEquals("XXX", result);
    }

    @Test
    public void shouldConvert39ToXXXIX() {
        int number = 39;

        String result = IntegerToRoman.convert(number);

        assertEquals("XXXIX", result);
    }

    @Test
    public void shouldConvert40ToXL() {
        int number = 40;

        String result = IntegerToRoman.convert(number);

        assertEquals("XL", result);
    }

    @Test
    public void shouldConvert44ToXLIV() {
        int number = 44;

        String result = IntegerToRoman.convert(number);

        assertEquals("XLIV", result);
    }

    @Test
    public void shouldConvert49ToXLIX() {
        int number = 49;

        String result = IntegerToRoman.convert(number);

        assertEquals("XLIX", result);
    }

    @Test
    public void shouldConvert50ToL() {
        int number = 50;

        String result = IntegerToRoman.convert(number);

        assertEquals("L", result);
    }
}
