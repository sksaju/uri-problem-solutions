import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1011 {
    public static double R, VOLUME, pi = 3.14159;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        R = sc.nextDouble();
        
        VOLUME = (4/3.0)*pi*Math.pow(R, 3);
        System.out.println("VOLUME = "+threeDecimalPlace(VOLUME));
    }
    
    static String threeDecimalPlace(double usrInput) {
        DecimalFormat threeDpFormat = new DecimalFormat("#0.000");
        String output = threeDpFormat.format(usrInput);
        return output;
    }
}
