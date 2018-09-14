import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1015 {
    public static double x1,y1,x2,y2, distance;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        distance = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println(fourDecimalPlace(distance));
    }
    
    static String fourDecimalPlace(double usrInput) {
        DecimalFormat fourDpFormat = new DecimalFormat("#0.0000");
        String output = fourDpFormat.format(usrInput);
        return output;
    }
}
