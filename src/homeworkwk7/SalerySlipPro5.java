package homeworkwk7;

import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class SalerySlipPro5 {
    //String Emplyname ;
    // int employeeId ,Basicsalary ,HRA,TA,DA,PF;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Employ ID   > ");

        String empId = scan.nextLine();

        System.out.print("Enter Employ name  > ");
        String name = scan.nextLine();
        System.out.println("Enter Basic Salary ");
        double salary = scan.nextInt();

        System.out.println(" _______________________________");
        System.out.println(" |        Salary Slip          |");
        System.out.println(" |_____________________________|");
        System.out.println(" | Employee Id :         " + empId + "  |");
        System.out.println(" | Employee Name :       " + name + "   |");

        System.out.println(" |_____________________________|");
        System.out.println(" | Basic Salary :      " + salary   + " |");
        double HRA = (salary * 10) / 100;
        System.out.println(" | HRA 10% :           " + HRA    + "  |");
        double DA = (salary * 8) / 100;
        System.out.println(" | TA 8% :             " + DA    + " |");
        double TA = (salary * 9) / 100;
        System.out.println(" | DA 9% :             " + TA  + " |");
        double PF = (salary * 20) / 100;
        System.out.println(" | PF - 20& :          " + PF  + " |");

        System.out.println(" |_____________________________|");
        double Grosssalary = salary + HRA + TA + DA + PF;
        System.out.println(" | Gross Salary: " + Grosssalary  + "  |");
        System.out.println(" |=============================|");

    }
}
