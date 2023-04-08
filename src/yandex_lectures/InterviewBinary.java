package yandex_lectures;

import java.util.Scanner;
import java.util.Timer;

public class InterviewBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Timer timer = new Timer();
        long m = System.currentTimeMillis();
        System.out.println(solveDays(n, k));
        System.out.println((double) (System.currentTimeMillis() - m));
        m = System.currentTimeMillis();
        System.out.println(solveDaysBinary(n, k));
        System.out.println((double) (System.currentTimeMillis() - m));
    }

    public static int solveDays(int n, int k) {
        int m = k;
        int counter = 1;
        while (n >= m) {
            counter++;
            k++;
            m += k + 1;
        }
        return counter;
    }

    public static int solveDaysBinary(int n, int k) {
        int l = 1;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if ((k + (k + m - 1)) * m / 2 >= n) {
                r = m;
            } else l = m + 1;
        }
        return l;
    }
}
