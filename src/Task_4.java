import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        int n = in.nextInt();
        int[] a = new int[5];
        int min = 0;
        int max = 0;
        while (n != 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
            min = max;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] < n & a[i] == min) {
                    a[i] = n;
                    break;
                }
            }
            n = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}