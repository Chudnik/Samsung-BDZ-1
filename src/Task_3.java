import java.util.Locale;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int summ = n;
        int count = 0;
        while (n != 0) {
            n = in.nextInt();
            summ += n;
        }
        for (int i = 0; i < summ + 1; i++) {
            if (i * i <= summ) {
                count = i;
            }
        }
        System.out.println(count);
    }
}