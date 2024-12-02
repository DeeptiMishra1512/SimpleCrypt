import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private final String shiftUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String shiftLower = "abcdefghijklmnopqrstuvwxyz";

    ROT13(Character cs, Character cf) {

    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (isUpperCase(c)) {
                result.append(rotate(shiftUpper, c));
            } else if (isLowerCase(c)) {
                result.append(rotate(shiftLower, c));
            } else {
                result.append(c); // Non-alphabetical characters remain unchanged
            }
        }
        return result.toString();

    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int index = s.indexOf(c);

        if(index == -1)
            return c;

        int shiftIndex = (index + 13) % 26;
        String newAlpha = s.charAt(shiftIndex);

        return newAlpha;
    }

}
