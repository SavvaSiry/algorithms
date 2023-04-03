package tink;

import java.util.Scanner;

public class LineSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 1;
        int k = 1;
        int chet = -1;
        int neChet = -1;

        while (n != k) {
            int num = scanner.nextInt();
            if (k % 2 == 0 && num % 2 == 1) {
                if (neChet == -1) neChet = k;
                else {
                    chet = -1;
                    neChet = -1;
                    break;
                }
            } else if (k % 2 == 1 && num % 2 == 0) {
                if (chet == -1) chet = k;
                else {
                    chet = -1;
                    neChet = -1;
                    break;
                }
            }
            k++;
        }
        if (chet != -1 && neChet != -1) System.out.println(chet + " " + neChet);
        else System.out.println("-1 -1");
    }
}
