package yandex_lectures;

import java.util.Scanner;

public class SquareStickersChalkboardBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(findMaxLength(w, h, n));
    }

    private static int findMaxLength(int w, int h, int n) {
        int l = 1;
        int r = Math.max(w, h);
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (w * h / (m * m) >= n) {
                l = m;
            } else r = m - 1;
        }
        return l;
    }
}
