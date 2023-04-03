package tink;

import java.util.Scanner;

public class GenerateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.next().split("");
        String[] r = scanner.next().split("");
        if (l.length > 1) System.out.println(check(r, false) - check(l, true));
        else System.out.println(check(r, false) - check(l, true) + 1);

    }

    public static int check(String[] arr, boolean left) {
        int sum = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
                --sum;
                break;
            } else if (left && Integer.parseInt(arr[i]) == Integer.parseInt(arr[i + 1])) {
                --sum;
                break;
            }
        }
        return sum + (arr.length - 1) * 9;
    }
}
