package homeworkwk7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class NumAndStringArray17 {
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 35, 25, 35, -16, 60, -100,  34};
        Arrays.sort(numbers);
        for (int n: numbers){
            System.out.println(n);
        }

        String names[] = {"Java", "C", "C++", "Python", "Scala", "SQL"};
        Arrays.sort(names);
        for (String n: names){
            System.out.println(n);
        }
    }
}
