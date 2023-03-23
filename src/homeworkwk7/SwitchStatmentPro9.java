package homeworkwk7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 * Same as above program-8 using switch statement.
 */
public class SwitchStatmentPro9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet from A to F > ");

        String alphabet = scanner.next();
    switch (alphabet){
    case  "A":
        System.out.println("Aylesbury");
        break;
    case "B":
        System.out.println("Bristol");
        break;
    case "C":
        System.out.println("Cardiff");
        break;
    case "D":
        System.out.println("Dublin");
        break;
    case "E":
        System.out.println("Edinburgh");
        break;
    case "F":
        System.out.println("Florence");
        break;
    default:
        System.out.println("Invalid entry.");
}
    }
}
