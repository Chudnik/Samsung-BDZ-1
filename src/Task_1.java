import java.util.Locale;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n + 1; i++) {
            if (i * i <= n) {
                count = i;
            }
        }
        System.out.println(count);
    }
}