/**
 * UC7 - Store Character Pattern in a Class
 * 
 * This program prints "OOPS" as a banner using a CharacterPattern class
 * to encapsulate character and its pattern.
 * 
 * @author Ashlesha
 * @version 1.0
 */
public class UC7 {

    /**
     * Inner Static Class to store character and its pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character the character
         * @param pattern the 7-line pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility methods to create patterns

    public static CharacterPattern createOPattern() {
        return new CharacterPattern('O', new String[]{
            "  *****   ",
            " *     *  ",
            "*       * ",
            "*       * ",
            "*       * ",
            " *     *  ",
            "  *****   "
        });
    }

    public static CharacterPattern createPPattern() {
        return new CharacterPattern('P', new String[]{
            " ******   ",
            " *     *  ",
            " *     *  ",
            " ******   ",
            " *        ",
            " *        ",
            " *        "
        });
    }

    public static CharacterPattern createSPattern() {
        return new CharacterPattern('S', new String[]{
            "  *****   ",
            " *     *  ",
            "*         ",
            "  *****   ",
            "       *  ",
            " *     *  ",
            "  *****   "
        });
    }

    public static void main(String[] args) {

        // Create objects
        CharacterPattern oPattern = createOPattern();
        CharacterPattern pPattern = createPPattern();
        CharacterPattern sPattern = createSPattern();

        // Array of objects for "OOPS"
        CharacterPattern[] word = {
            oPattern, oPattern, pPattern, sPattern
        };

        // Build and print banner using StringBuilder
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]);
            }

            System.out.println(line);
        }
    }
}