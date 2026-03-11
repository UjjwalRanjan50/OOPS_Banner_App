public class BannerAppUC6 {

    // Static helper for 'O'
    public static String[] getO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Static helper for 'P'
    public static String[] getP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Static helper for 'S'
    public static String[] getS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {
        // Build banner using helper methods
        String[][] banner = { getO(), getO(), getP(), getS() };

        // Render line by line
        for (int row = 0; row < banner[0].length; row++) {
            for (String[] letter : banner) {
                System.out.print(letter[row] + "  ");
            }
            System.out.println();
        }
    }
}
