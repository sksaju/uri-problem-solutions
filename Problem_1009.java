import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1009 {
    public static String employee_name;
    public static double salary, total_sales, total_salary;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        employee_name = sc.nextLine();
        salary = sc.nextDouble();
        total_sales = sc.nextDouble();
        
        total_salary = salary+((total_sales*15)/100);
        System.out.println("TOTAL = R$ "+twoDecimalPlace(total_salary));
    }
    
    static String twoDecimalPlace(double usrInput) {
        DecimalFormat twoDpFormat = new DecimalFormat("#0.00");
        String output = twoDpFormat.format(usrInput);
        return output;
    }
}
