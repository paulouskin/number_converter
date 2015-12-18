package converter.implementations;

import converter.contracts.Convertable;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by NoteP on 18.12.2015.
 */
public class RomanNumeralsConverterTest {

    private static Convertable numeralsConverter;
    private int arabic2006 = 2006;
    private int arabic1944 = 1944;

    private String roman2006 = "MMVI";
    private String roman1944 = "MCMXLIV";
    private String incorrectNumeral = "CMCLXIVM";

    @BeforeClass
    public static void setUp() {
        numeralsConverter = new RomanNumeralsConverter();
    }

    @Test
    public void testConvertRomanMMVIToArabic2006() {
        int converted = numeralsConverter.convert(roman2006);
        Assert.assertEquals("Conversion number error", arabic2006, converted);
    }

    @Test
    public void testConvertRomanMCMXLIVToArabic1944() {
        int converted = numeralsConverter.convert(roman1944);
        Assert.assertEquals("Conversion number error", arabic1944, converted);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertIncorrectRomanNumeralThrowsIllegalArgumentException() {
        numeralsConverter.convert(incorrectNumeral);
    }

    @AfterClass
    public static void tearDown() {
        numeralsConverter = null;
    }

}
