import java.util.Scanner;

public class Problem_1018 {
    public static int amount, note_amount, notes[] = {100, 50, 20, 10, 5, 2, 1};
    public static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {
        amount = sc.nextInt();
        System.out.println(amount);
        for(int i=0; i<notes.length; i++) {
            note_amount = amount/notes[i];
            System.out.println(note_amount+" nota(s) de R$ "+notes[i]+",00");
            amount = amount%notes[i];
        }
    }
}
