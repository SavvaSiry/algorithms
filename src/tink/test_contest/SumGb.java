package tink.test_contest;

import java.util.Scanner;

public class SumGb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (d > b) System.out.println(a + (d - b) * c);
        else System.out.println(a);
    }
}
