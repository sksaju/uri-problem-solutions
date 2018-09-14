import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem_1021 {
    public static int note_amount, notes[] = {100, 50, 20, 10, 5, 2};
    public static double amount, coins[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        amount = sc.nextDouble();
        System.out.println("NOTAS:");
        for(int i=0; i<notes.length; i++) {
            note_amount = (int) (amount/notes[i]);
            System.out.println(note_amount+" nota(s) de R$ "+notes[i]+".00");
            amount = amount%notes[i];
        }
        System.out.println("MOEDAS:");
        for(int i=0; i<coins.length; i++) {
            note_amount = (int) (amount/coins[i]);
            System.out.println(note_amount+" moeda(s) de R$ "+twoDecimalPlace(coins[i]));
            amount = round(amount%coins[i], 2);
        }
    }
    
    static String twoDecimalPlace(double usrInput) {
        DecimalFormat twoDpFormat = new DecimalFormat("#0.00");
        String output = twoDpFormat.format(usrInput);
        return output;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
