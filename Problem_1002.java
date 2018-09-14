import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1002 {
    
    public static double r, a, pie=3.14159;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        a = pie * (r * r);
 
        System.out.println("A="+fourDecimalPlace(a));
 
    }
    
    static String fourDecimalPlace(double usrInput) {
        DecimalFormat fourDpFormat = new DecimalFormat("#0.0000");
        String output = fourDpFormat.format(usrInput);
        return output;
    }
}
