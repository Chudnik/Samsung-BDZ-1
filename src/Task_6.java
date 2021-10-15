import java.util.Locale;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int maxx = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            if (m % 100 == 11) {
                if (maxx < m) {
                    maxx = m;
                }
            }
        }
        System.out.println(maxx);
    }
}
