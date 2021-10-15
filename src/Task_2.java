import java.util.Locale;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int m = in.nextInt();
        int maxx = m;
        int minn = m;
        int summ = m;
        for (int i = 0; i < n - 1; i++) {
            m = in.nextInt();
            summ += m;
            if (m < minn) {
                minn = m;
            }
            if (m > maxx) {
                maxx = m;
            }
        }
        System.out.println("Максимальное число: " + maxx);
        System.out.println("Минимальное число: " + minn);
        System.out.println("Среднее арифметическое чисел " + summ / n);
    }
}
