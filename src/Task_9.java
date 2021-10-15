import java.util.Locale;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        String n = in.nextLine();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != n.charAt(n.length() - i)) {
                System.out.print("No");
                break;
            }
        }System.out.print("Yes");
    }
}


