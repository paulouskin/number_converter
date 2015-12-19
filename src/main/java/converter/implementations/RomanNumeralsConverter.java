package converter.implementations;

import converter.contracts.Convertible;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by NoteP on 18.12.2015.
 */
public class RomanNumeralsConverter implements Convertible {

    private static final String ROMAN_REGEX = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    public String convert(String rNumeral) {

        String romanNumeral = rNumeral.toUpperCase().trim();
        if (isRomanNumeral(romanNumeral)) {
            return parseRomanNumeral(romanNumeral);
        } else {
            throw new IllegalArgumentException("Provided string not roman numeral.");
        }
    }

    private boolean isRomanNumeral(String romanNumeral) {
        if (!romanNumeral.isEmpty()) {
            Pattern romanNumeralPattern = Pattern.compile(ROMAN_REGEX);
            Matcher matchRomanNumeralPattern = romanNumeralPattern.matcher(romanNumeral);
            return matchRomanNumeralPattern.find();
        }
        return false;
    }

    private String parseRomanNumeral(String romanNumeral) {

        int arabic = 0;
        int last_digit = 0;
        int current_digit = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            current_digit = returnCorrespondentNumber(romanNumeral.charAt(i));

            if (last_digit < current_digit && last_digit != 0) {
                current_digit -= last_digit;
                arabic -= last_digit;
                arabic += current_digit;
                last_digit = current_digit;
            } else {
                last_digit = current_digit;
                arabic += current_digit;
            }
        }
        return String.valueOf(arabic);
    }

    private int returnCorrespondentNumber(char romanNum) {
        int arabic = 0;
        switch (romanNum){
            case 'I' : arabic = 1; break;
            case 'V' : arabic = 5; break;
            case 'X' : arabic = 10; break;
            case 'L' : arabic = 50; break;
            case 'C' : arabic = 100; break;
            case 'D' : arabic = 500; break;
            case 'M' : arabic = 1000; break;
        }
        return arabic;
    }
}
