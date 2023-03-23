package homeworkwk7;

import java.util.Scanner;

/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */
public class MarkSheetPro3 {
    String name;
    int roll,maths,science,english;

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        //to input student Name, roll No, and three subjects Math, Science and
        //English marks
        System.out.print("Enter student name > ");
        String name =input.nextLine();
        System.out.print("Enter roll number > ");
        int roll =input.nextInt();
        System.out.print("Enter maths marks  > ");
        int maths = input.nextInt();
        System.out.print("Enter science marks > ");
        int science = input.nextInt();
        System.out.print("Enter english marks > ");
        int english = input.nextInt();

        //marks is between 0 to 100 and if it is out of range print error message “Invalid
        //Input, Marks should between 0 to 100”)
        if (maths < 0 || maths >100 || science < 0 || science >100 || english < 0 || english >100 ){
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }

        // and find out total, percentage and result.
        int total = maths + science + english;
        int percentage = (total*100)/300;

        //If he is pass or fail on basis of percentage (pass>=35)
        String result = "Fail";
        if(percentage >=35){
            result="Pass";
        }
        //and also give them grade if %> = 80 A+,
        //%> = 60 A, %> = 50 B, %> = 35 C
        String grade="C";
        if (percentage >= 80){
            grade="A+";
        }else if(percentage >= 60){
            grade="A";
        }else if(percentage >= 50){
            grade="B";
        }

        //And print Mark Sheet in following format
        String marksheet =
                "_______________________________\n" +
                "| |\n" +
                "| Mark Sheet |\n" +
                "|_______________________________|\n" +
                "| Name : " + name + " |\n" +
                "| Roll No: " + roll +  " |\n" +
                "|_______________________________|\n" +
                "| Subjects : Marks |\n" +
                "|_______________________________|\n" +
                "| Math : "  + maths +  " |\n" +
                "| Science : " + science  + " |\n" +
                "| English : " + english + " |\n" +
                "|_______________________________|\n" +
                "| Total : " + total + " |\n" +
                "|_______________________________|\n" +
                "| Percentage : " + percentage + " |\n" +
                "| Result : " + result + " |\n" +
                "| Grade : " + grade + " |\n" +
                "|_______________________________|";

        System.out.println(marksheet);
    }
}
