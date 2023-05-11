package tink.test_contest;

import java.util.Scanner;

public class CutPie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 0;
        while (n != 1) {
            n = n/2 + n % 2;
            counter++;
        }
        System.out.println(counter);
    }
}
