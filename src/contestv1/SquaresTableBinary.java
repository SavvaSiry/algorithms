package contestv1;

import java.util.Scanner;

public class SquaresTableBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w1 = scanner.nextInt();
        int h1 = scanner.nextInt();
        int w2 = scanner.nextInt();
        int h2 = scanner.nextInt();

        int w = resolve(w1, h1, w2, h2);
        int h = resolve(w1, h1, h2, w2);
        int wr = resolve(h1, w1, w2, h2);
        int hr = resolve(h1, w1, h2, w2);

        if (w <= h && w <= wr && w <= hr) System.out.println(Math.max(w1, w2) + " " + w / Math.max(w1, w2));
        else if (h <= w && h <= wr && h <= hr) System.out.println(Math.max(w1, h2) + " " + h / Math.max(w1, h2));
        else if (wr <= w && wr <= h && wr <= hr) System.out.println(Math.max(h1, w2) + " " + wr / Math.max(h1, w2));
        else System.out.println(Math.max(h1, h2) + " " + hr/ Math.max(h1, h2));
    }

    private static int resolve(int w1, int h1, int w2, int h2) {
        int l = Math.min(h1, h2);
        int r = h1 + h2;
        int maxW = Math.max(w1, w2);
        while (l < r) {
            int m = (l + r) / 2;
            if (maxW * m >= w1 * h1 + w2 * h2 && m >= h1 + h2)
                r = m;
            else l = m + 1;
        }
        return l * maxW;
    }
}
