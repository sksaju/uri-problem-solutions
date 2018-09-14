import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1036 {
    public static double a, b, c, d, r1, r2;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        d = (Math.pow(b, 2) - (4*a*c));
        r1 = (-b+Math.sqrt(d))/(2*a);
        r2 = (-b-Math.sqrt(d))/(2*a);
        
        if(a!=0 && d>0) {
            System.out.println("R1 = "+fiveDecimalPlace(r1));
            System.out.println("R2 = "+fiveDecimalPlace(r2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
    
    static String fiveDecimalPlace(double usrInput) {
        DecimalFormat fiveDpFormat = new DecimalFormat("#0.00000");
        String output = fiveDpFormat.format(usrInput);
        return output;
    }
}
