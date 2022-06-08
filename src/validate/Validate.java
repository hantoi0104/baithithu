package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private static final String MENU_CHOICE = "[1-9]{1}";
    private static final String ID_PRODUCT = "[0-9]{5}";
    private static final String NAME_PRODUCT = "^[A-Z]";
    private static final String PRICE_PRODUCT = "^[1-9]{0,9}";
    private static final String QUANTITY_PRODUCT = "^[0-9]{2}";
    private static final String DIS_PRODUCT = "^[a-z][a-z0-9]{0,100}";

    public static boolean validateMenuChoice(String regex) {
        Pattern pattern = Pattern.compile(MENU_CHOICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateIDProduct(String regex) {
        Pattern pattern = Pattern.compile(ID_PRODUCT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateNameProduct(String regex) {
        Pattern pattern = Pattern.compile(NAME_PRODUCT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePriceProduct(String regex) {
        Pattern pattern = Pattern.compile(PRICE_PRODUCT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateDisProduct(String regex) {
        Pattern pattern = Pattern.compile(DIS_PRODUCT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validateQuantityProduct(String regex) {
        Pattern pattern = Pattern.compile(QUANTITY_PRODUCT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
