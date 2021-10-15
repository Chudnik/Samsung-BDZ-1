import java.util.Locale;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            while (m > 9) {
                m /= 10;
            }
            count = (count + m) * 10;
        }
        System.out.println(count / 10);
    }
}

