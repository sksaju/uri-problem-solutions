import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1017 {
    public static int spent_time, average_speed;
    public static double needed_liters, spent_oer_hour = 12.0;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        spent_time = sc.nextInt();
        average_speed = sc.nextInt();
        
        needed_liters = (spent_time*average_speed)/spent_oer_hour;
        System.out.println(threeDecimalPlace(needed_liters));
    }
    
    static String threeDecimalPlace(double usrInput) {
        DecimalFormat threeDpFormat = new DecimalFormat("#0.000");
        String output = threeDpFormat.format(usrInput);
        return output;
    }
}
