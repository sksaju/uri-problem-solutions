import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Problem_1010 {
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    Locale.setDefault(Locale.US);
 
    int a, b;
    double c, total = 0;
    String x;
    for (int n = 0; n < 2; n++) {
 
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextDouble();
        x = String.format("%.2f", c);
        c = Double.parseDouble(x);
 
        total = (b * c) + total;
 
    }
 
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
 
}