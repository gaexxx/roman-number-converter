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

    // test mirati sui casi importanti del range 51..100
    @Test
    public void shouldConvert58ToLVIII() {
        int number = 58;

        String result = IntegerToRoman.convert(number);

        assertEquals("LVIII", result);
    }

    @Test
    public void shouldConvert74ToLXXIV() {
        int number = 74;

        String result = IntegerToRoman.convert(number);

        assertEquals("LXXIV", result);
    }

    @Test
    public void shouldConvert89ToLXXXIX() {
        int number = 89;

        String result = IntegerToRoman.convert(number);

        assertEquals("LXXXIX", result);
    }

    @Test
    public void shouldConvert90ToXC() {
        int number = 90;

        String result = IntegerToRoman.convert(number);

        assertEquals("XC", result);
    }

    @Test
    public void shouldConvert94ToXCIV() {
        int number = 94;

        String result = IntegerToRoman.convert(number);

        assertEquals("XCIV", result);
    }

    @Test
    public void shouldConvert99ToXCIX() {
        int number = 99;

        String result = IntegerToRoman.convert(number);

        assertEquals("XCIX", result);
    }

    @Test
    public void shouldConvert100ToC() {
        int number = 100;

        String result = IntegerToRoman.convert(number);

        assertEquals("C", result);
    }

    // test mirati sui casi importanti del range 101..500
    @Test
    public void shouldConvert149ToCXLIX() {
        int number = 149;

        String result = IntegerToRoman.convert(number);

        assertEquals("CXLIX", result);
    }

    @Test
    public void shouldConvert244ToCCXLIV() {
        int number = 244;

        String result = IntegerToRoman.convert(number);

        assertEquals("CCXLIV", result);
    }

    @Test
    public void shouldConvert399ToCCCXCIX() {
        int number = 399;

        String result = IntegerToRoman.convert(number);

        assertEquals("CCCXCIX", result);
    }

    @Test
    public void shouldConvert400ToCD() {
        int number = 400;

        String result = IntegerToRoman.convert(number);

        assertEquals("CD", result);
    }

    @Test
    public void shouldConvert444ToCDXLIV() {
        int number = 444;

        String result = IntegerToRoman.convert(number);

        assertEquals("CDXLIV", result);
    }

    @Test
    public void shouldConvert499ToCDXCIX() {
        int number = 499;

        String result = IntegerToRoman.convert(number);

        assertEquals("CDXCIX", result);
    }

    @Test
    public void shouldConvert500ToD() {
        int number = 500;

        String result = IntegerToRoman.convert(number);

        assertEquals("D", result);
    }

    // test mirati sui casi importanti del range 501..1000
    @Test
    public void shouldConvert899ToDCCCXCIX() {
        int number = 899;

        String result = IntegerToRoman.convert(number);

        assertEquals("DCCCXCIX", result);
    }

    @Test
    public void shouldConvert900ToCM() {
        int number = 900;

        String result = IntegerToRoman.convert(number);

        assertEquals("CM", result);
    }

    @Test
    public void shouldConvert944ToCMXLIV() {
        int number = 944;

        String result = IntegerToRoman.convert(number);

        assertEquals("CMXLIV", result);
    }

    @Test
    public void shouldConvert999ToCMXCIX() {
        int number = 999;

        String result = IntegerToRoman.convert(number);

        assertEquals("CMXCIX", result);
    }

    @Test
    public void shouldConvert1000ToM() {
        int number = 1000;

        String result = IntegerToRoman.convert(number);

        assertEquals("M", result);
    }
    
    // test out of bound
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNumberIsZero() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNumberIsNegative() {
        IntegerToRoman.convert(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNumberIsGreaterThan1000() {
        IntegerToRoman.convert(1001);
    }
}
