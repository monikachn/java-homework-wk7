package homeworkwk7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityNamePro8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet from A to F > ");

        String alphabet = scanner.next() ;
scanner.close();
        if("A".equals(alphabet)){
            System.out.println("Ayl");
        }else if("B".equals(alphabet)){
            System.out.println("Bristol");
        }else if("C".equals(alphabet)){
            System.out.println("Cardiff");
        }else if("D".equals(alphabet)){
            System.out.println("Dublin");
        }else if("E".equals(alphabet)){
            System.out.println("Edinburgh");
        }else if("F".equals(alphabet)){
            System.out.println("Florence");
        }else {
            System.out.println("Invalid entry.");
        }

    }
}
