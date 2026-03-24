/**
 * UC3 - Render OOPS as Banner using String.join()
 * 
 * This program prints "OOPS" as a banner using '*' and spaces.
 * Each line is constructed using String.join() instead of + operator.
 * 
 * @author Ashlesha
 * @version 1.0
 */
public class UC3 {

    public static void main(String[] args) {

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " ******   ",
                "  *****   "));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *     *  ",
                " *     *  "));

        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                " *     *  ",
                "*         "));

        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                " ******   ",
                "  *****   "));

        System.out.println(String.join("",
                "*       * ",
                "*       * ",
                " *        ",
                "       *  "));

        System.out.println(String.join("",
                " *     *  ",
                " *     *  ",
                " *        ",
                " *     *  "));

        System.out.println(String.join("",
                "  *****   ",
                "  *****   ",
                " *        ",
                "  *****   "));
    }
}