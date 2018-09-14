import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1012 {
    public static double A, B, C, pi = 3.14159, triangle, circle, trapezium, square, rectangle;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        triangle = 0.5*A*C;
        circle = pi*Math.pow(C, 2);
        trapezium = 0.5*(A+B)*C;
        square = Math.pow(B, 2);
        rectangle = A*B;
                
        System.out.println("TRIANGULO: " +threeDecimalPlace(triangle));
        System.out.println("CIRCULO: " +threeDecimalPlace(circle));
        System.out.println("TRAPEZIO: " +threeDecimalPlace(trapezium));
        System.out.println("QUADRADO: " +threeDecimalPlace(square));
        System.out.println("RETANGULO: " +threeDecimalPlace(rectangle));
    }
    
    static String threeDecimalPlace(double usrInput) {
        DecimalFormat threeDpFormat = new DecimalFormat("#0.000");
        String output = threeDpFormat.format(usrInput);
        return output;
    }
}
