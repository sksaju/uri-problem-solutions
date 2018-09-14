import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static double A,B,MEDIA;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        A = sc.nextDouble();
        B = sc.nextDouble();
        
        MEDIA = (A*3.5+B*7.5)/(3.5+7.5);
        System.out.println("MEDIA = "+fiveDecimalPlace(MEDIA));
    }
    
    static String fiveDecimalPlace(double usrInput) {
        DecimalFormat fiveDpFormat = new DecimalFormat("#0.00000");
        String output = fiveDpFormat.format(usrInput);
        return output;
    }
}
