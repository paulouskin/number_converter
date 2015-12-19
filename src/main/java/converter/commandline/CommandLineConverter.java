package converter.commandline;

import converter.contracts.Convertible;
import converter.implementations.RomanNumeralsConverter;

/**
 * Created by NoteP on 19.12.2015.
 */
public class CommandLineConverter {
    public static void main(String [] args) {
        Convertible romanConverter = new RomanNumeralsConverter();
        if (args.length != 1) {
            System.out.printf("Wrong number of arguments.");
        } else {
            System.out.printf("You pass %s roman which corresponds to %s arabic",
                    args[0].toUpperCase(), romanConverter.convert(args[0]));
        }
    }
}
