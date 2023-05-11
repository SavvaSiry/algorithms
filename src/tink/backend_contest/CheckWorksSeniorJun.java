package tink.backend_contest;

import java.util.Scanner;


public class CheckWorksSeniorJun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((int) Math.ceil(n * k * 1.0 / m));
    }
}
