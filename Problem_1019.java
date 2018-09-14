import java.util.Scanner;

public class Problem_1019 {
    public static long input_sec;
    public static int secs, mins, hours,remainder;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        input_sec = sc.nextLong();
        
        hours = (int) (input_sec/3600);
        remainder = (int) input_sec - hours * 3600;
        mins = remainder / 60;
        
        secs = remainder - mins * 60;
        
        System.out.println(hours+":"+mins+":"+secs);
    }
}
