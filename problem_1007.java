import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static int A,B,C,D,DIFERENCA;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        DIFERENCA = (A*B) - (C*D);
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
}
