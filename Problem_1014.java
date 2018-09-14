import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1014 {
    public static int X;
    public static double Y, consumption;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        X = sc.nextInt();
        Y = sc.nextDouble();
        
        consumption = (X/Y);
        System.out.println(threeDecimalPlace(consumption)+" km/l");
    }
    
    static String threeDecimalPlace(double usrInput) {
        DecimalFormat threeDpFormat = new DecimalFormat("#0.000");
        String output = threeDpFormat.format(usrInput);
        return output;
    }
}
