import java.util.*;

class BannerChar {
    private String character;
    private String[] pattern;

    public BannerChar(String character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }

    public String getCharacter() {
        return character;
    }
}

public class OopsBannerApp {

    // Map to store character patterns
    private static final Map<String, BannerChar> patterns = new HashMap<>();

    static {
        patterns.put("O", new BannerChar("O", new String[]{
            " **** ",
            "*    *",
            "*    *",
            "*    *",
            " **** "
        }));

        patterns.put("P", new BannerChar("P", new String[]{
            "***** ",
            "*    *",
            "***** ",
            "*     ",
            "*     "
        }));

        patterns.put("S", new BannerChar("S", new String[]{
            " **** ",
            "*     ",
            " **** ",
            "     *",
            " **** "
        }));
    }

    // Function to display banner text
    public static void displayBanner(String text) {
        text = text.toUpperCase();
        int rows = patterns.get(text.substring(0,1)).getPattern().length;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : text.toCharArray()) {
                BannerChar bc = patterns.get(String.valueOf(c));
                if (bc != null) {
                    line.append(bc.getPattern()[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}
