import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1008 {
    public static int employee_number, work_hour;
    public static double amount_per_hour, salary;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        employee_number = sc.nextInt();
        work_hour = sc.nextInt();
        amount_per_hour = sc.nextDouble();
        
        salary = work_hour*amount_per_hour;
        System.out.println("NUMBER = "+employee_number);
        System.out.println("SALARY = U$ "+twoDecimalPlace(salary));
    }
    
    static String twoDecimalPlace(double usrInput) {
        DecimalFormat twoDpFormat = new DecimalFormat("#0.00");
        String output = twoDpFormat.format(usrInput);
        return output;
    }
}
