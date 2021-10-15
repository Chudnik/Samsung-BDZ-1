import java.util.Locale;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt(), m = in.nextInt();
        for (int i = 1; i < n + 2; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
