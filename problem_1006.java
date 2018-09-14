import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static double A,B,C,MEDIA;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        MEDIA = (A*2+B*3+C*5)/(2+3+5);
        System.out.println("MEDIA = "+oneDecimalPlace(MEDIA));
    }
    
    static String oneDecimalPlace(double usrInput) {
        DecimalFormat oneDpFormat = new DecimalFormat("#0.0");
        String output = oneDpFormat.format(usrInput);
        return output;
    }
}
