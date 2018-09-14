import java.util.Scanner;

public class Problem_1003 {
    public static int A,B,SOMA;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        A = sc.nextInt();
        B = sc.nextInt();
        
        SOMA = A+B;
        System.out.println("SOMA = "+SOMA);
        //System.out.printf("SOMA = %d \n", SOMA);
    }
}
