import java.util.Scanner;

public class Problem_1035 {
    public static int A, B, C, D, AB, CD;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        AB = A+B;
        CD = C+D;
        
        if(B > C && D > A && CD > AB && C>=0 && D>=0 && A%2==0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
