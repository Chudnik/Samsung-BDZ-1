import java.util.Locale;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int count = 0;
        int k = 0;
        for (int i = 1; i < n + 1; i++) {
            count = 0;
            for (int j = 1; j < n + 1; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                while (n % i == 0) {
                    n /= i;
                    k += 1;
                    if (k != 1) {
                        System.out.print("*" + i);
                    } else {
                        System.out.print(i);
                    }
                }
            }
        }
    }
}
