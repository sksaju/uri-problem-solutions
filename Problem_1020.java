import java.util.Scanner;

public class Problem_1020 {
    public static int input_days, days, months, years, remainder;
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        input_days = sc.nextInt();
        
        years = (input_days/365);
        remainder = input_days - years * 365;
        months = remainder / 30;
        days = remainder - months * 30;
        
        System.out.println(years+" ano(s)");
        System.out.println(months+" mes(es)");
        System.out.println(days+" dia(s)");
    }
}
