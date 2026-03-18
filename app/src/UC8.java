/**
 * OOPSBannerApp UC1 - OOPS Banner Display Application
 *
 * This class demonstrates a simple Java application that displays the Object
 * Oriented Programming System OOPS acronym to the console.
 *
 * @author UjjwalRanjan 
 * @version 1.0
 */
import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Centralized character pattern storage using HashMap
    private static final Map<Character, String[]> characterPatterns = new HashMap<>();

    static {
        characterPatterns.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        characterPatterns.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        characterPatterns.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    // Render banner word by fetching patterns from the map
    public static void renderBanner(String word) {
        word = word.toUpperCase();

        // Each character pattern has 5 rows
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (char ch : word.toCharArray()) {
                String[] pattern = characterPatterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append("  "); // spacing between letters
                } else {
                    line.append("     ").append("  "); // blank for unknown chars
                }
            }
            System.out.println(line);
        }
    }

    // Main method to run UC8
    public static void main(String[] args) {
        renderBanner("OOPS");
    }
}
