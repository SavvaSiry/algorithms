package yandex_lectures;

import java.io.BufferedReader;
import java.util.Scanner;

public class BinarySearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findXinArray(x, array));
    }

    private static int findXinArray(int x, int[] array) {
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (array[m] >= x) {
                r = m;
            } else l = m + 1;
        }
        if (array[l] == x) return l;
        else return array.length;
    }
}
