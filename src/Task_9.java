import java.util.Locale;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        long n = in.nextLong();
        long a = n;
        long last = 0;
        long x = 0;
        while (n > 0) {
            last = n % 10;
            x = (x * 10) + last;
            n = n / 10;
        }
        if (x == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


