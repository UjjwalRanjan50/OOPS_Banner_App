/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author UjjwalRanjan 
 * @version 4.0
 */
import java.util.HashMap;
import java.util.Map;

public class BannerAppUC7 {

    // Inner class to encapsulate character patterns
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    // Static inner class to store mappings
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            // Define patterns for O, P, S
            patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            }));
        }

        public static CharacterPattern getPattern(char c) {
            return patternMap.get(c);
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";

        // Build banner dynamically from stored patterns
        int rows = CharacterPatternMap.getPattern('O').getPattern().length;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = CharacterPatternMap.getPattern(c).getPattern();
                line.append(pattern[row]).append("  ");
            }
            System.out.println(line);
        }
    }
}
