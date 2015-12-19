package converter.implementations;

import converter.contracts.Convertible;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by NoteP on 18.12.2015.
 */
public class RomanNumeralsConverterTest {

    private static Convertible numeralsConverter;
    private String arabic2006 = "2006";
    private String arabic1944 = "1944";
    private String arabic259 = "259";
    private String arabic1566 = "1566";

    private String roman2006 = "MMVI";
    private String roman1944 = "MCMXLIV";
    private String roman259Downcase = "cclix";
    private String roman1566WithWhitespaces = " MDLXVI  ";

    private String incorrectNumeral = "CMCLXIVM";
    private String justAString = "MMVI Romans.";
    private String emptyString = "";

    @BeforeClass
    public static void setUp() {
        numeralsConverter = new RomanNumeralsConverter();
    }

    @Test
    public void testConvertRomanMMVIToArabic2006() {
        String converted = numeralsConverter.convert(roman2006);
        Assert.assertEquals("Conversion number error", arabic2006, converted);
    }

    @Test
    public void testConvertRomanMCMXLIVToArabic1944() {
        String converted = numeralsConverter.convert(roman1944);
        Assert.assertEquals("Conversion number error", arabic1944, converted);
    }

    @Test
    public void testConvertRomanCCLIXDowncasedToArabic259() {
        String converted = numeralsConverter.convert(roman259Downcase);
        Assert.assertEquals("Conversion number error", arabic259, converted);
    }

    @Test
    public void testConvertRomanMDLXVIWithWhitespacesToArabic1566() {
        String converted = numeralsConverter.convert(roman1566WithWhitespaces);
        Assert.assertEquals("Conversion number error", arabic1566, converted);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertIncorrectRomanNumeralThrowsIllegalArgumentException() {
        numeralsConverter.convert(incorrectNumeral);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertEmptyStringThrowsIllegalArgumentException() {
        numeralsConverter.convert(emptyString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertJustAStringThrowsIllegalArgumentException() {
        numeralsConverter.convert(justAString);
    }

    @AfterClass
    public static void tearDown() {
        numeralsConverter = null;
    }

}
