import java.util.Scanner;

public class Problem_1013 {
    
    public static int a,b,s;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.nextInt();
        
        if (a > b && a > s) {
            System.out.println(a+" eh o maior");
        }
        else if (b > a && b > s) {
            System.out.println(b+" eh o maior");
        }
        else if (s > a && s > b) {
            System.out.println(s+" eh o maior");
        }
 
    }
}
