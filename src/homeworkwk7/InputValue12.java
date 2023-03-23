package homeworkwk7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class InputValue12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value  > ");
        String s = input.next();
        charCheck(s.charAt(0));
    }

    static void charCheck(char input_char)
    {
        // CHECKING FOR ALPHABET
        if ((input_char >= 65 && input_char <= 90)
                || (input_char >= 97 && input_char <= 122))
            System.out.println(" Alphabet ");

            // CHECKING FOR DIGITS
        else if (input_char >= 48 && input_char <= 57)
            System.out.println(" Number ");

            // OTHERWISE SPECIAL CHARACTER
        else
            System.out.println(" Symbol ");
    }

}
