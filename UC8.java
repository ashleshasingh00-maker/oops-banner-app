/**
 * UC8 - Use Map for Character Patterns and Render via Function
 * 
 * This program prints "OOPS" as a banner using a HashMap
 * to store character patterns and a function to render them.
 * 
 * @author Ashlesha
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        // Step 1: Build pattern map
        Map<Character, String[]> patternMap = buildPatternMap();

        // Step 2: Input word
        String word = "OOPS";

        // Step 3: Render banner
        renderBanner(word, patternMap);
    }

    /**
     * Builds and returns the character pattern map
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  *****   ",
            " *     *  ",
            "*       * ",
            "*       * ",
            "*       * ",
            " *     *  ",
            "  *****   "
        });

        map.put('P', new String[]{
            " ******   ",
            " *     *  ",
            " *     *  ",
            " ******   ",
            " *        ",
            " *        ",
            " *        "
        });

        map.put('S', new String[]{
            "  *****   ",
            " *     *  ",
            "*         ",
            "  *****   ",
            "       *  ",
            " *     *  ",
            "  *****   "
        });

        return map;
    }

    /**
     * Renders banner for given word using pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        // Outer loop for 7 rows
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Inner loop for each character
            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]);
                } else {
                    // fallback for unknown character
                    line.append("         ");
                }
            }

            System.out.println(line);
        }
    }
}