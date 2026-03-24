/**
 * UC5 - Render OOPS as Banner using Inline Array Initialization
 * 
 * This program prints "OOPS" as a banner using '*' and spaces.
 * Array is declared and initialized in a single step using String.join().
 * 
 * @author Ashlesha
 * @version 1.0
 */
public class UC5 {

    public static void main(String[] args) {

        // Inline array initialization
        String[] banner = {
            String.join("", "  *****   ", "  *****   ", " ******   ", "  *****   "),
            String.join("", " *     *  ", " *     *  ", " *     *  ", " *     *  "),
            String.join("", "*       * ", "*       * ", " *     *  ", "*         "),
            String.join("", "*       * ", "*       * ", " ******   ", "  *****   "),
            String.join("", "*       * ", "*       * ", " *        ", "       *  "),
            String.join("", " *     *  ", " *     *  ", " *        ", " *     *  "),
            String.join("", "  *****   ", "  *****   ", " *        ", "  *****   ")
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}