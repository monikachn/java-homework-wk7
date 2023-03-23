package homeworkwk7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
  /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class SymbolPro10 {
    public static void main(String args[])
    {
        int first, second, add = 0, subtract = 0, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers > ");
        first = scanner.nextInt();
        second = scanner.nextInt();
        System.out.print("Enter the Operator... + - * / > ");
        String operator = scanner.next();

        if("+".equals(operator)){
            add = first + second;
            System.out.println("Sum = " + add);
        }else if("-".equals(operator)){
            subtract = first - second;
            System.out.println("Difference = " + subtract);
        }else if("*".equals(operator)){
            multiply = first * second;
            System.out.println("multiply = " + multiply);
        }else if ("/".equals(operator)){
            devide = first / second;
            System.out.println("devide ="+ devide);
        }

    }
}


